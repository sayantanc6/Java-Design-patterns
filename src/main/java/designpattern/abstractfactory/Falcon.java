package designpattern.abstractfactory;

public class Falcon implements Computer{
	
	public Falcon() {
	}

	@Override
	public String getModel() {
		return "falcon_model";
	}

	@Override
	public String getVendorName() {
		return "falcon";
	}

}
