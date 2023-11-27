package designpattern.abstractfactory;

public enum ExtendedPhoneType implements PhoneTypes{

	REALME(new RealMe());
	
	private Object object;

	ExtendedPhoneType(Object object) {
		this.object = object;
	}

	@Override
	public Object getConstructor() {
		return object;
	}
}
