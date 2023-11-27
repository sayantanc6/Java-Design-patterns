package designpattern.abstractfactory;

public class LaptopFactory {
	
	Laptop laptop;
	
	public LaptopFactory() {
	}
	
	public LaptopFactory(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public Object makeLaptop(LaptopTypes type) {
		return type.getConstructor();
	}

}
