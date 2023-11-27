package designpattern.chainofresponsibility;

import java.util.ArrayList;

public class ChainOfResposibilityTest {

	public static void main(String[] args) throws Exception {
		
		FilterChain chain1 = new ValidDomainFilter();
		FilterChain chain2 = new CheckLoginFilter();
		FilterChain chain3 = new XMLMarshallerFilter();
		
		chain1.nextInChain(chain2);
		chain2.nextInChain(chain3);
		
		String urlString = "https://www.google.com/search?q=echo+environment+variables+windows&safe=active&hl=en&sxsrf=AJOqlzX1tJkEq4CjpYLkyRXQwq310UUPtw%3A1679281087297&ei=v8sXZNriEeaB3LUP8oaFqA8&oq=ECHO+ENVIRONME&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAxgBMgQIABBDMgUIABCRAjIECAAQQzIFCAAQgAQyBAgAEEMyBQgAEIAEMgQIABBDMgsILhCABBDHARCvATIFCAAQgAQyBQgAEIAEOg0ILhDHARDRAxDqAhAnOgcIIxDqAhAnOg0IABCPARDqAhC0AhgBOg0ILhCPARDqAhC0AhgBOgQIIxAnOgsIABCABBCxAxCDAToHCAAQsQMQQzoKCC4QsQMQ5QQQQzoLCC4QrwEQxwEQgAQ6CwguEIAEEMcBENEDOgcIABCABBANOg0ILhCABBANEMcBEK8BSgQIQRgAUOAIWI80YNZCaAJwAXgAgAHaAogBxh6SAQYyLTEzLjKYAQCgAQGwARTAAQHaAQYIARABGAo&sclient=gws-wiz-serp";
		
		Answer answer1=new Answer(101,"java is a programming language","Sayantan");  
	    Answer answer2=new Answer(102,"java is a platform","Sandipan");  
	      
	    ArrayList<Answer> list=new ArrayList<Answer>();  
	    list.add(answer1);  
	    list.add(answer2);   
	       
	    Question question=new Question(1,"What is java?",list); 
		
		Request request = new Request(urlString,question);
		chain1.processRequest(request); 
	}
}
