package designpattern.iterator;

public class Food {

	String foodname;
	FoodType type;
	
	public Food(String foodname, FoodType type) {
		super();
		this.foodname = foodname;
		this.type = type;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public FoodType getType() {
		return type;
	}

	public void setType(FoodType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Food [foodname=" + foodname + ", type=" + type + "]";
	}
	
}
