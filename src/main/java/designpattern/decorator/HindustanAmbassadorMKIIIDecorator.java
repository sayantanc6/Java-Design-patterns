package designpattern.decorator;

public class HindustanAmbassadorMKIIIDecorator implements Car {
	
	HindustanAmbassadorMKI hindustanAmbassadorMKI;

	public HindustanAmbassadorMKIIIDecorator(HindustanAmbassadorMKI hindustanAmbassadorMKI) {
		super();
		this.hindustanAmbassadorMKI = hindustanAmbassadorMKI;
	}

	@Override
	public int getEnginesize() {
		return hindustanAmbassadorMKI.getEnginesize()+309;
	}
	
	@Override
	public String getEngineTypeString() {
		return hindustanAmbassadorMKI.getEngineTypeString();
	}


	@Override
	public int getCylindernumber() {
		return hindustanAmbassadorMKI.getCylindernumber();
	}

	@Override
	public int getMaxpower() {
		return hindustanAmbassadorMKI.getMaxpower()+25;
	}

	@Override
	public int getMaxtorque() {
		return hindustanAmbassadorMKI.getMaxtorque()+30;
	}

	@Override
	public int getgGearbox() {
		return hindustanAmbassadorMKI.getgGearbox();
	}

	@Override
	public int getWeight() {
		return hindustanAmbassadorMKI.getWeight()+45;
	}
}
