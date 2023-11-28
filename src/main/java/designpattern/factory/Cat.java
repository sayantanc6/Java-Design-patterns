package designpattern.factory;

public class Cat implements Animal {
	
	public Cat() {}

	@Override
	public String makeSound() {
		return "meaow";
	}

}
