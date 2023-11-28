package designpattern.state;

import java.lang.reflect.InvocationTargetException;

public interface FanState {

	void on() throws NoSuchMethodException ,SecurityException , IllegalAccessException , IllegalArgumentException , InvocationTargetException;
	void off() throws NoSuchMethodException ,SecurityException , IllegalAccessException , IllegalArgumentException , InvocationTargetException;
	void volumeUp() throws NoSuchMethodException ,SecurityException , IllegalAccessException , IllegalArgumentException , InvocationTargetException;
	void volumeDown()throws NoSuchMethodException ,SecurityException , IllegalAccessException , IllegalArgumentException , InvocationTargetException;

}
