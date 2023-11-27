package designpattern.abstractfactory;

public enum FactoryType {

	COMPUTER_FACTORY(new ComputerFactory()),
	PHONE_FACTORY(new PhoneFactory()),
	LAPTOP_FACTORY(new LaptopFactory());

	private Object object;
	
	FactoryType(Object object) {
		this.object = object;
	}

	Object getConstructor() {
		return object;
	}
}
