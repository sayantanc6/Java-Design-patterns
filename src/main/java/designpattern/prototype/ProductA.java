package designpattern.prototype;

public class ProductA implements Prototype<ProductA> {

	@Override
	public ProductA copy() throws CloneNotSupportedException { 
			return (ProductA) this.clone(); 
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "productA";
	}

}
