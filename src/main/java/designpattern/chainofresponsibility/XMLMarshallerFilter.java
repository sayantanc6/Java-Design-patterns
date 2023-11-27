package designpattern.chainofresponsibility;

import java.io.FileOutputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class XMLMarshallerFilter implements FilterChain {
	
	private FilterChain chain;
	private FileOutputStream outstream;

	@Override
	public void nextInChain(FilterChain chain) {
		this.chain = chain; 
	}

	@Override
	public void processRequest(Request request) throws Exception {
		JAXBContext context = JAXBContext.newInstance(request.getBody().getClass());
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); 
        StringWriter sw = new StringWriter();
        outstream = new FileOutputStream("request_body_marshaller.xml");
		marshaller.marshal(request.getBody(), outstream);
		marshaller.marshal(request.getBody(), sw);
		String xmlContent = sw.toString();
		System.out.println("url parsed : "+request.getParseStringURLfromMap());
		System.out.println("request body : \n"+xmlContent); 
		this.chain.processRequest(request); 
	}
}
