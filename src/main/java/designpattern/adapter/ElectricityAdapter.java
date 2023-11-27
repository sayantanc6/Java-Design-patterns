package designpattern.adapter;

public class ElectricityAdapter implements Iron {
	
	Electricity electricity;
	Cloth cloth;
	
	public ElectricityAdapter(Electricity electricity,Cloth cloth) {
		this.electricity = electricity;
		this.cloth = cloth;
	}

	@Override
	public void ironing() { 
		electricity.ironingWithElectricity();
		cloth.setClothStraightening(true);
		System.out.println("cloth staightened : "+cloth.isClothStraightening());
	}
}
