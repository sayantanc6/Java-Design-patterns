package designpattern.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		
		HindustanAmbassadorMKI mki = new HindustanAmbassadorMKI();
		System.out.println("MKI CAR..");
		System.out.println("cylinder number: "+mki.getCylindernumber());
		System.out.println("engine size : "+mki.getEnginesize());
		System.out.println("engine type : "+mki.getEngineTypeString());
		System.out.println("gearbox : "+mki.getgGearbox());
		System.out.println("maxpower : "+mki.getMaxpower());
		System.out.println("max torque : "+mki.getMaxtorque());
		System.out.println("Weight : "+ mki.getWeight());
		System.out.println();
		
		HindustanAmbassadorMKIIIDecorator mkiiiDecorator = new HindustanAmbassadorMKIIIDecorator(new HindustanAmbassadorMKI());
		System.out.println("MKIIIDECORATOR CAR..");
		System.out.println("cylinder number: "+mkiiiDecorator.getCylindernumber());
		System.out.println("engine size : "+mkiiiDecorator.getEnginesize());
		System.out.println("engine type : "+mkiiiDecorator.getEngineTypeString());
		System.out.println("gearbox : "+mkiiiDecorator.getgGearbox());
		System.out.println("maxpower : "+mkiiiDecorator.getMaxpower());
		System.out.println("max torque : "+mkiiiDecorator.getMaxtorque());
		System.out.println("Weight : "+ mkiiiDecorator.getWeight());
		System.out.println();
		
		HindustanAmbassadorMKIVDecorator mkivDecorator = new HindustanAmbassadorMKIVDecorator(new HindustanAmbassadorMKIIIDecorator(new HindustanAmbassadorMKI()));
		System.out.println("MKIVDECORATOR CAR..");
		System.out.println("cylinder number: "+mkivDecorator.getCylindernumber());
		System.out.println("engine size : "+mkivDecorator.getEnginesize());
		System.out.println("engine type : "+mkivDecorator.getEngineTypeString());
		System.out.println("gearbox : "+mkivDecorator.getgGearbox());
		System.out.println("maxpower : "+mkivDecorator.getMaxpower());
		System.out.println("max torque : "+mkivDecorator.getMaxtorque());
		System.out.println("Weight : "+ mkivDecorator.getWeight());
		System.out.println();
		

	}

}
