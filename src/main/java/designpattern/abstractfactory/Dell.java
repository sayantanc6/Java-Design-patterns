package designpattern.abstractfactory;

public class Dell implements Computer {
	
	public Dell() {
	}

	@Override
	public String getModel() {
		return "dell_model";
	}

	@Override
	public String getVendorName() {
		return "dell";
	}


}
