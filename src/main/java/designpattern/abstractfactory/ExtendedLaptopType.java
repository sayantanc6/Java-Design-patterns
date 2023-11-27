package designpattern.abstractfactory;

public enum ExtendedLaptopType implements LaptopTypes {
	MACBOOK(new Macbook());

	private Object object;
	
	ExtendedLaptopType(Object object) {
		this.object = object;
	}

	@Override
	public Object getConstructor() {
		return object;
	}

}
