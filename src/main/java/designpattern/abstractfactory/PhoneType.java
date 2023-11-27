package designpattern.abstractfactory;

public enum PhoneType implements PhoneTypes{

	SAMSUNG(new Samsung()),
	MOTOROLA(new Motorola());
	
	private Object object;

	PhoneType(Object object) {
		this.object = object;
	}
	
	@Override
	public Object getConstructor() {
		return object;
	}
}
