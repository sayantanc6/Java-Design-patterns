package designpattern.state;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class FanOn implements FanState {
	
	private Map<String, Method> mapmethodnames;
	
	public FanOn() {
	}

	@Override
	public void on() throws NoSuchMethodException ,SecurityException , IllegalAccessException , IllegalArgumentException , InvocationTargetException {
		
		mapmethodnames = Fan.getInstance().mapMethodReflect();

			Method setOn = mapmethodnames.get("setOn");
			setOn.setAccessible(true);
			setOn.invoke(null, true);
			
			
			Method setOff = mapmethodnames.get("setOff");
			setOff.setAccessible(true);
			setOff.invoke(null, false);
		
			System.out.println("Fan is on");
	}

	@Override
	public void off()  throws NoSuchMethodException ,SecurityException , IllegalAccessException , IllegalArgumentException , InvocationTargetException {
		
		
	}

	@Override
	public void volumeUp()  throws NoSuchMethodException ,SecurityException , IllegalAccessException , IllegalArgumentException , InvocationTargetException {

	}

	@Override
	public void volumeDown()  throws NoSuchMethodException ,SecurityException , IllegalAccessException , IllegalArgumentException , InvocationTargetException {
		
	}

}
