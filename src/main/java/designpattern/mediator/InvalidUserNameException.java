package designpattern.mediator;

public class InvalidUserNameException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public InvalidUserNameException(String errormessage) {
		super(errormessage);
	}
}
