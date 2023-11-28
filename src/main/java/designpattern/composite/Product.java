package designpattern.composite;

public class Product extends Node {
	
	private String demo1;
	private String demo2;

	public Product(String demo1, String demo2) {
		super();
		this.demo1 = demo1;
		this.demo2 = demo2;
	}

	@Override
	public void addChild(Node node) {}

	@Override
	public void removeChild(Node node) {}

	@Override
	public String displayNode() { 
		return demo1+" "+demo2;
	}
}
