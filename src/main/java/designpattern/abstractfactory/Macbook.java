package designpattern.abstractfactory;

public class Macbook implements Laptop {
	
	public Macbook() {
	}

	@Override
	public String getModel() {
		return "macbook_model";
	}

	@Override
	public String getVendorName() {
		return "macbook";
	}

}
