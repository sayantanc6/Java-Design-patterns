package designpattern.abstractfactory;

public enum LaptopType implements LaptopTypes{
	
	HP(new HP()),
	APPLE(new Apple());

	private Object object;
	
	LaptopType(Object object) {
		this.object = object;
	}
	 
	@Override
	public Object getConstructor() {
		return object;
	}
}
