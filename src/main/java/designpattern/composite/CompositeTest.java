package designpattern.composite;

public class CompositeTest {

	public static void main(String[] args) {
		Node producttree = new ProductGroup();
		producttree.addChild(new Product("demo1", "demo11"));
		producttree.addChild(new Product("demo2", "demo22"));
		producttree.addChild(new Product("demo3", "demo33"));
		producttree.addChild(new Product("N1", "N2"));
		producttree.addChild(new Product("demo4", "demo44"));
		producttree.addChild(new Product("demo5", "demo55"));
		producttree.addChild(new Product("demo6", "demo66"));

		
		System.out.println(producttree.displayNode());
		
		

	}

}
