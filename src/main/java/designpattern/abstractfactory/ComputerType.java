package designpattern.abstractfactory;

public enum ComputerType implements ComputerTypes{

	DELL(new Dell()),
	LENOVO(new Lenovo());

	private Object object;

	ComputerType(Object object) {
		this.object = object;
	}
	
	@Override
	public Object getConstructor() {
		return object;
	}
}
