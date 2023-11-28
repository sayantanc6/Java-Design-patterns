package designpattern.decorator;

public class HindustanAmbassadorMKI implements Car {

	@Override
	public int getEnginesize() {
		return 1489;
	}
	

	@Override
	public String getEngineTypeString() {
		return "Carburetted, inline, naturally aspirated (BMC B-Series)";
	}

	@Override
	public int getCylindernumber() {
			return 4;
	}

	@Override
	public int getMaxpower() {
		return 50;
	}

	@Override
	public int getMaxtorque() {
		return 100;
	}

	@Override
	public int getgGearbox() {
		return 4;
	}

	@Override
	public int getWeight() {
		return 1020;
	}
}
