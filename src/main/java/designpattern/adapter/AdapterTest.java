package designpattern.adapter;

public class AdapterTest {

	public static void main(String[] args) {

		System.out.println("without electricity : ");
		Ironer ironer = new Ironer(new Cloth());
		ironer.ironing();
		 System.out.println();
		 
		System.out.println("with electricity : ");
		Ironer ironer_ = new Ironer(new ElectricityAdapter(new Electricity(), new Cloth()));
		ironer_.ironing();
	}
}
