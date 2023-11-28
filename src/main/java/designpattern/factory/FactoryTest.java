package designpattern.factory;

public class FactoryTest {

	public static void main(String[] args) { 
		
	AnimalType type = AnimalType.CAT; 
		 
		Animal animaltype =  AnimalFactory.getAnimal(type); 
		System.out.println(animaltype.makeSound()); 
	}
}
