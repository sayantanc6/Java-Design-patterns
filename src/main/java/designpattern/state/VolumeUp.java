package designpattern.state;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class VolumeUp implements FanState {
	
	private Map<String, Method> mapmethodnames;
	
	public VolumeUp() {
	}

	@Override
	public void on() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
	}

	@Override
	public void off() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
	}

	@Override
	public void volumeUp() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		mapmethodnames = Fan.getInstance().mapMethodReflect();

		Method setOn = mapmethodnames.get("setOn");
		setOn.setAccessible(true);
		setOn.invoke(null, true);
			
			
		Method getVolumeUp = mapmethodnames.get("getVolumeUp");
		getVolumeUp.setAccessible(true);
		int volumeUp = (int) getVolumeUp.invoke(null);
			
			
		Method setVolumeUp = mapmethodnames.get("setVolumeUp");
		setVolumeUp.setAccessible(true); 
		setVolumeUp.invoke(null, ++volumeUp);
			
			
		Method setOff = mapmethodnames.get("setOff");
		setOff.setAccessible(true);
		setOff.invoke(null, false);
			
		
		System.out.println("Fan's volume is up "+volumeUp);
	}

	@Override
	public void volumeDown() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
	}
}
