package designpattern.singleton;

public class SingletonCarClassic {
	
	private static Car car = null;
	
	private  SingletonCarClassic() {}
	
	public static Car getInstance() {
		if (car == null) {
			car = new Car();
		}
		return car;
	}

}
