package designpattern.abstractfactory;

public class Motorola implements Phone {
	
	public Motorola() {
	}

	@Override
	public String getModel() {
		return "motorola_model";
	}

	@Override
	public String getVendorName() {
		return "motorola";
	}
}
