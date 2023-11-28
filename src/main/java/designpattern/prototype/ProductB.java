package designpattern.prototype;

public class ProductB implements Prototype<ProductB> {

	@Override
	public ProductB copy() throws CloneNotSupportedException {
		return (ProductB)this.clone();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "productB";
	}
}
