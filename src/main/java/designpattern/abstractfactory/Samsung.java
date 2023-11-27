package designpattern.abstractfactory;

public class Samsung implements Phone {
	
	public Samsung() {
	}

	@Override
	public String getModel() {
		return "samsung_model";
	}

	@Override
	public String getVendorName() {
		return "samsung";
	}
}
