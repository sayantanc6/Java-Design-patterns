package designpattern.abstractfactory;

public enum ExtendedComputerType implements ComputerTypes {
	
	FALCON(new Falcon());

	private Object object;
	
	ExtendedComputerType(Object object) {
		this.object = object;	
	}

	@Override
	public Object getConstructor() {
		return object;
	}

}
