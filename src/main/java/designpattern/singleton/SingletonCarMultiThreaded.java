package designpattern.singleton;

public class SingletonCarMultiThreaded {
	
	private static volatile Car car = new Car();
	
	private SingletonCarMultiThreaded() {} 
	
	public static Car getInstance() {
		return car;
	}

}
