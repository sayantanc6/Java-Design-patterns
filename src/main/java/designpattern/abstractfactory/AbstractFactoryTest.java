
package designpattern.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		PhoneFactory phoneFactory = (PhoneFactory) FactoryBuilder.getFactory(FactoryType.PHONE_FACTORY);
		Motorola phone =  (Motorola) phoneFactory.makePhone(PhoneType.MOTOROLA);
		System.out.println(phone.getModel());
		System.out.println(phone.getVendorName());
		System.out.println();
		
		ComputerFactory computerFactory = (ComputerFactory) FactoryBuilder.getFactory(FactoryType.COMPUTER_FACTORY);
		Dell computer = (Dell) computerFactory.makeComputer(ComputerType.DELL);
		System.out.println(computer.getModel());
		System.out.println(computer.getVendorName());
		System.out.println();
		
		LaptopFactory laptopFactory = (LaptopFactory) FactoryBuilder.getFactory(FactoryType.LAPTOP_FACTORY);
		HP laptop = (HP) laptopFactory.makeLaptop(LaptopType.HP);
		System.out.println(laptop.getModel());
		System.out.println(laptop.getVendorName());
		System.out.println();
	}
}

