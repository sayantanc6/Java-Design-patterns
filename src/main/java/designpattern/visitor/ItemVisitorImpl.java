package designpattern.visitor;

public class ItemVisitorImpl implements ItemVisitor {

	@Override
	public float getPrice(Apple apple) { 
		return apple.getAverageWeightinGram() *  Math.abs((float)apple.getPricePerKg()/1000) * apple.getQuantity();
	}

	@Override
	public float getPrice(Orange orange) { 
		return orange.getAverageWeightinGram() * Math.abs((float)orange.getPricePerKg()/1000) * orange.getQuantity();
	}

	@Override
	public float getPrice(Guava guava) {
		return guava.getAverageWeightinGram() * Math.abs((float)guava.getPricePerKg()/1000) * guava.getQuantity();
	}
}
