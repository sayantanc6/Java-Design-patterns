package designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class ProductGroup extends Node {
	
	List<Product> products = new ArrayList<Product>();
	String result="";
	StringBuilder builder = new StringBuilder();

	public ProductGroup(List<Product> products) {
		super();
		products.forEach(this::addChild); 
	}

	public ProductGroup() {	}

	@Override
	public void addChild(Node node) {
		products.add((Product) node);
	}

	@Override
	public void removeChild(Node node) {
		products.remove(node);
		
	}

	@Override
	public String displayNode() {
		return this.toString();
	}

	@Override
	public String toString() {
		for (Product product : products) {
			builder.append(product.displayNode());
			builder.append("\n");
		}
		return builder.toString();
	}

}
