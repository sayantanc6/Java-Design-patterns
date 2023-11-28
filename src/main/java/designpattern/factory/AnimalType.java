package designpattern.factory;

public enum AnimalType {

	DOG(new Dog()),
	CAT(new Cat());

	private Object object;
	
	AnimalType(Object object) {
		this.object = object;
	}

	Object getConstructor() {
		return object;
	}
}
