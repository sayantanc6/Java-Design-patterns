package designpattern.visitor;

public class Guava implements ItemVisitable{

	private int averageWeightinGram = 200;
	private int PricePerKg = 500;
	private int quantity = 1;
	
	public Guava(int quantity) {
		super();
		this.quantity = quantity;
	}

	public int getAverageWeightinGram() {
		return averageWeightinGram;
	}

	public void setAverageWeightinGram(int averageWeightinGram) {
		this.averageWeightinGram = averageWeightinGram;
	}

	public int getPricePerKg() {
		return PricePerKg;
	}

	public void setPricePerKg(int pricePerKg) {
		PricePerKg = pricePerKg;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public float accept(ItemVisitor visitor) {
		
		return visitor.getPrice(this);
	}
}
