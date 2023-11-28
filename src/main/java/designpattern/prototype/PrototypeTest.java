package designpattern.prototype;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		ProductA productA = new ProductA();
		ProductA clonedproductA = new ProductA().copy();
		
		System.out.println("productA hashcode identity : "+productA.hashCode());
		System.out.println("productA name : "+productA.getName());
		System.out.println("clonedProductA hashcode identity : "+clonedproductA.hashCode());
		System.out.println("clonedProductA name : "+clonedproductA.getName());
		
		System.out.println();
		ProductB productB = new ProductB();
		ProductB clonedproductB = new ProductB().copy();
		
		System.out.println("productB hashcode identity : "+productB.hashCode());
		System.out.println("productB name : "+productB.getName());
		System.out.println("clonedProductB hashcode identity : "+clonedproductB.hashCode());
		System.out.println("clonedProductB name : "+clonedproductB.getName());
	}
}
   
