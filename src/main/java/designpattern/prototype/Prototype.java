package designpattern.prototype;

public interface Prototype<T> extends Cloneable {

	T copy() throws CloneNotSupportedException; 
	String getName();
}
