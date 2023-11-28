package designpattern.factory;

public class AnimalFactory {

	public static Animal getAnimal(AnimalType type) {
	    return (Animal) type.getConstructor(); 
	  }
}
