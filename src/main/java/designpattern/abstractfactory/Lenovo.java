package designpattern.abstractfactory;

public class Lenovo implements Computer {
	
	public Lenovo() {
	}

	@Override
	public String getModel() {
		return "lenovo_dell";
	}

	@Override
	public String getVendorName() {
		return "lenovo";
	}
	
}
