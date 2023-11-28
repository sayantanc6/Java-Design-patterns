package designpattern.state;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class FanOff implements FanState {
	
	private Map<String, Method> mapmethodnames;
	
	public FanOff() {
	}

	@Override
	public void on() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
	}

	@Override
	public void off() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException,InvocationTargetException {
		
		mapmethodnames = Fan.getInstance().mapMethodReflect();		
		   
			Method seton = mapmethodnames.get("setOn");
			seton.setAccessible(true);
			seton.invoke(null, false);
			
			
			Method setVolumeUp = mapmethodnames.get("setVolumeUp");
			setVolumeUp.setAccessible(true);
			setVolumeUp.invoke(null, 0);
			
			
			
			Method setVolumeDown = mapmethodnames.get("setVolumeDown");
			setVolumeDown.setAccessible(true);
			setVolumeDown.invoke(null, 0); 
			
			Method setOff = mapmethodnames.get("setOff");
			setOff.setAccessible(true);
			setOff.invoke(null, true);
			
			
		
			System.out.println("Fan is off");
	}

	@Override
	public void volumeUp() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
	}

	@Override
	public void volumeDown() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
	}
}
