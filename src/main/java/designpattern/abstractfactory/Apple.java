package designpattern.abstractfactory;

public class Apple implements Laptop {
	
	public Apple() {
	}

	@Override
	public String getModel() {
		return "apple_model";
	}

	@Override
	public String getVendorName() {
		return "apple";
	}

} 
