package designpattern.state;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fan {
	
	private Method[] methods;
	private List<String> methodnames;
	private Map<String, Method> methodnamesMap;

	private static volatile boolean on = false;
	private static volatile boolean off = true;
	private static volatile int volumeUp = 0;
	private static volatile int volumeDown = 0;
	
	private FanState stateOn;
	private FanState stateOff;
	private FanState stateVolumeOn;
	private FanState stateVolumeOff;

	
	private static volatile Fan fan =  new Fan();
	
	private Fan() {	
		stateOn = new FanOn();
		stateOff = new FanOff();
		stateVolumeOff = new VolumeDown();
		stateVolumeOn = new VolumeUp();
	}
	 
	public static Fan getInstance() {
		if (fan == null) {
			fan = new Fan();
		}
		return fan;
	}
	
	@SuppressWarnings("unused")
	private static boolean isOn() {
		return on;
	}
	
	@SuppressWarnings("unused")
	private static void setOn(boolean on) {
		Fan.on = on;
	}
	
	@SuppressWarnings("unused")
	private static boolean isOff() {
		return off;
	}
	
	@SuppressWarnings("unused")
	private static void setOff(boolean off) {
		Fan.off = off;
	}

	
	@SuppressWarnings("unused")
	private static int getVolumeUp() {
		return volumeUp;
	}

	@SuppressWarnings("unused")
	private static void setVolumeUp(int volumeUp) {
		Fan.volumeUp = volumeUp;
		Fan.volumeDown = volumeUp;

	}

	@SuppressWarnings("unused")
	private static int getVolumeDown() {
		return volumeDown;
	}

	@SuppressWarnings("unused")
	private static void setVolumeDown(int volumeDown) {
		Fan.volumeDown = volumeDown;
		Fan.volumeUp = volumeDown;
	}

	public void FanOn() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		stateOn.on();
	}
	
	public void FanOff() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		stateOff.off();
	}
	
	public void FanVolumeUp() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		stateVolumeOn.volumeUp();
	}
	
	public void FanVolumeDown() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		stateVolumeOff.volumeDown();
	}
	
	public Map<String, Method> mapMethodReflect() {
		methods = Fan.class.getDeclaredMethods();
		methodnames = new ArrayList<String>();
		methodnamesMap = new HashMap<String, Method>();
		
		for (Method method : methods) {
			   methodnames.add(method.getName());
		   }
		     
		   for (int i = 0; i < methodnames.size(); i++) {
			   	for (Method method : methods) {
				if (methodnames.get(i).equals(method.getName()))  
					methodnamesMap.put(methodnames.get(i),method); 
			   }
		   }
		   
		return methodnamesMap;
	}
}
