package designpattern.chainofresponsibility;

public class InvalidDomainException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public InvalidDomainException(String domain) {
		super();
		System.out.println("invalid domain name : "+domain);
	}

}
