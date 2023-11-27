package designpattern.abstractfactory;

public class PhoneFactory{
	
	Phone phone;
	
	public PhoneFactory() {
	}

	public Object makePhone(PhoneTypes type) {
		return type.getConstructor();
	}

}
