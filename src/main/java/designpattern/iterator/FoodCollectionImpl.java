package designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class FoodCollectionImpl implements FoodCollection {
	
	List<Food> foods;
	
	public FoodCollectionImpl() {
		foods = new ArrayList<Food>();
	}
	
	public FoodCollectionImpl(List<Food> foods) {
		this.foods = foods;
	}

	@Override
	public void addFood(Food food) {
		foods.add(food);

	}

	@Override
	public void removeFood(int position) {
		foods.remove(position);

	}

	@Override
	public FoodIterator getIterator(FoodType type) {
		return new FoodIteratorImpl(type,this.foods);
	}
	
	private class FoodIteratorImpl implements FoodIterator {
		
		private FoodType type;
		private List<Food> foods;
		private int position;
		
		FoodIteratorImpl(FoodType type,List<Food> foods){
			this.type = type;
			this.foods = foods;
		}

		@Override
		public boolean hasNext() {
			while (position < foods.size()) {
				Food food = foods.get(position);
				if (food.getType().equals(type) || food.getType().equals(FoodType.ALL)) {
					return true;
				} else {
					position++;
				}
			}
			return false;
		}

		@Override
		public Food next() {
			Food food= foods.get(position);
			if (position < foods.size()) 
				position++;
			return food;
		}
	}
          }
