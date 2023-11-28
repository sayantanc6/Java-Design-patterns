package designpattern.decorator;

public class HindustanAmbassadorMKIVDecorator implements Car {
	
	HindustanAmbassadorMKIIIDecorator HindustanAmbassadorMKIIIDecorator;

	public HindustanAmbassadorMKIVDecorator(
			designpattern.decorator.HindustanAmbassadorMKIIIDecorator hindustanAmbassadorMKIIIDecorator) {
		super();
		HindustanAmbassadorMKIIIDecorator = hindustanAmbassadorMKIIIDecorator;
	}

	@Override
	public int getEnginesize() {
		return HindustanAmbassadorMKIIIDecorator.getEnginesize()-309;
	}

	@Override
	public String getEngineTypeString() {
		return "HindustanAmbassadorMKIVDecorator engine type Direct Injection, inline, naturally aspirated (BMC B-Series)";
	}

	@Override
	public int getCylindernumber() {
		return HindustanAmbassadorMKIIIDecorator.getCylindernumber();
	}

	@Override
	public int getMaxpower() {
		return HindustanAmbassadorMKIIIDecorator.getMaxpower()-39;
	}

	@Override
	public int getMaxtorque() {
		return HindustanAmbassadorMKIIIDecorator.getMaxtorque()-55;
	}

	@Override
	public int getgGearbox() {
		return HindustanAmbassadorMKIIIDecorator.getgGearbox();
	}

	@Override
	public int getWeight() {
		return HindustanAmbassadorMKIIIDecorator.getWeight();
	}

}
