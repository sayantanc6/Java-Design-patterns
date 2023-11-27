package designpattern.abstractfactory;

public class FactoryBuilder {

	public static Object getFactory(FactoryType type) {
	    return  type.getConstructor(); 
	  }
	

}
