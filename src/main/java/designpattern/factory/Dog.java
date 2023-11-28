package designpattern.factory;


public class Dog implements Animal{
	
	public Dog() {}

	@Override
	public String makeSound() {
		return "bark";
	}

}
