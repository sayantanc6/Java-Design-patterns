package designpattern.chainofresponsibility;

import java.util.regex.Pattern;

public class ValidDomainFilter implements FilterChain {
	
	private FilterChain chain;
	private String domainpattern = "/(?:[a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?\\.)+[a-z0-9][a-z0-9-]{0,61}[a-z0-9]/g";
	
	public ValidDomainFilter() { }

	@Override
	public void nextInChain(FilterChain chain) {
		this.chain = chain;
	}
 
	@Override
	public void processRequest(Request request) throws Exception {
		String[] domain = request.getParseStringUrl().split("\\?");
		if (Pattern.compile(domainpattern).matcher(domain[0]).find()) {
			 System.out.println("valid domain : "+domain[0]);
			 this.chain.processRequest(request);
		} else 
			throw new InvalidDomainException(domain[0]);
		
	}
}
 
