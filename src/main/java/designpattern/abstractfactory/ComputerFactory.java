package designpattern.abstractfactory;

public class ComputerFactory{
	
	Computer computer;
	
	public ComputerFactory() {
	}

	public Object makeComputer(ComputerTypes type) {
		return type.getConstructor();
	}
	
}
