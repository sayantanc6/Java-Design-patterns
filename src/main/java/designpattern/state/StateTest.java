package designpattern.state;

import java.lang.reflect.InvocationTargetException;

public class StateTest {

	public static void main(String[] args) {
		Fan fan = Fan.getInstance();
		try {
			fan.FanOff();
			fan.FanOn();
			fan.FanVolumeDown();
			fan.FanVolumeUp();
			fan.FanVolumeUp();
			fan.FanVolumeUp();
			fan.FanVolumeDown();
			fan.FanVolumeDown();
			fan.FanVolumeDown();	
			fan.FanVolumeDown();
			fan.FanOff();
			fan.FanVolumeUp();
			fan.FanVolumeDown();
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
