package designpattern.iterator;

public interface FoodCollection {

	void addFood(Food food);
	void removeFood(int position);
	FoodIterator getIterator(FoodType type);
}
