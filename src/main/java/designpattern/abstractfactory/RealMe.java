package designpattern.abstractfactory;

public class RealMe implements Phone {
	
	public RealMe() {
	}

	@Override
	public String getModel() {
		return "realme_model";
	}

	@Override
	public String getVendorName() {
		return "realme";
	}

}
