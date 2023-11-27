package designpattern.abstractfactory;

public class HP implements Laptop {
	
	
	public HP() {
	}

	@Override
	public String getModel() {
		return "HP_model";
	}

	@Override
	public String getVendorName() {
		return "HP";
	}

}
