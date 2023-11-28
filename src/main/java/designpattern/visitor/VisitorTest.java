package designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorTest {

	public static void main(String[] args) {
		List<ItemVisitable> items = new ArrayList<ItemVisitable>();
		items.add(new Apple(5));
		items.add(new Orange(7));
		items.add(new Guava(9));
		
		float totalprice = 0;
		
		ItemVisitor visitor = new ItemVisitorImpl();
		
		for (ItemVisitable itemVisitable : items) 
			totalprice= totalprice + itemVisitable.accept(visitor);
		
		System.out.println("total price of fruits : "+totalprice);
	}
}
