package designpattern.state;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class VolumeDown implements FanState {
	
	private Map<String, Method> mapmethodnames;
	
	public VolumeDown() {
	}

	@Override
	public void on() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
	}

	@Override
	public void off() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
	}

	@Override
	public void volumeUp() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
	}

	@Override
	public void volumeDown() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		mapmethodnames = Fan.getInstance().mapMethodReflect();
		
		Method setOn = mapmethodnames.get("setOn");
		setOn.setAccessible(true);
		setOn.invoke(null, true); 
			
			
		Method getVolumeDown = mapmethodnames.get("getVolumeDown");
		getVolumeDown.setAccessible(true);
		int volumeDown = (int) getVolumeDown.invoke(null);
			
			 
		Method setVolumeDown = mapmethodnames.get("setVolumeDown");
		setVolumeDown.setAccessible(true); 
		if (volumeDown > 0) {
			setVolumeDown.invoke(null, --volumeDown);
		}
		Method setOff = mapmethodnames.get("setOff");
		setOff.setAccessible(true);
		setOff.invoke(null, false);

		   
		System.out.println("Fan's volume is down "+volumeDown);
	}
}

