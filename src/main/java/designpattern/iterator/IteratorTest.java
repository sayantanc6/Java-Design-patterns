package designpattern.iterator;

import java.util.Arrays;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {
		
		// first approach
		FoodCollection foods =populateFoods();
		FoodIterator iterator = foods.getIterator(FoodType.VEG);
		
		while (iterator.hasNext()) {
			Food food = iterator.next();
			System.out.println(food.toString());
		}
		// second approach
		List<Food> _foods = Arrays.asList(new Food("ginger", FoodType.ALL),
				 new Food("spinach", FoodType.VEG),
				 new Food("paneer", FoodType.DAIRY),
				 new Food("garlic", FoodType.VEG),
				 new Food("milk", FoodType.DAIRY), 
				 new Food("banana", FoodType.FRUIT),
				 new Food("meat", FoodType.NON_VEG), 
				 new Food("egg", FoodType.NON_VEG),
				 new Food("pea", FoodType.LEGUMES),
				 new Food("soya bean", FoodType.LEGUMES),
				 new Food("rye", FoodType.SEEDS),
				 new Food("bread seed", FoodType.SEEDS),
				 new Food("chia seed", FoodType.SEEDS),
				 new Food("peanut", FoodType.NUTS),
				 new Food("walnut", FoodType.NUTS),
				 new Food("almond", FoodType.NUTS),
				 new Food("chestnut", FoodType.NUTS),
				 new Food("wheat", FoodType.CEREAL),
				 new Food("barley", FoodType.CEREAL),
				 new Food("oats", FoodType.CEREAL),
				 new Food("pearl millet", FoodType.CEREAL),
				 new Food("finger millet", FoodType.CEREAL));
		FoodCollection foodCollection = new FoodCollectionImpl(_foods);
		FoodIterator _iterator = foodCollection.getIterator(FoodType.ALL);
		
		while (_iterator.hasNext()) {
			Food food = _iterator.next();
			System.out.println(food.toString());
		}
	}

	private static FoodCollection populateFoods() {
		FoodCollection foods = new FoodCollectionImpl();
		foods.addFood((new Food("ginger", FoodType.VEG)));
		foods.addFood((new Food("spinach", FoodType.VEG)));
		foods.addFood((new Food("paneer", FoodType.DAIRY)));
		foods.addFood((new Food("garlic", FoodType.VEG)));
		foods.addFood((new Food("milk", FoodType.DAIRY))); 
		foods.addFood((new Food("banana", FoodType.FRUIT)));
		foods.addFood((new Food("meat", FoodType.NON_VEG))); 
		foods.addFood((new Food("egg", FoodType.NON_VEG)));
		foods.addFood((new Food("pea", FoodType.LEGUMES)));
		foods.addFood((new Food("soya bean", FoodType.LEGUMES)));
		foods.addFood((new Food("rye", FoodType.SEEDS)));
		foods.addFood((new Food("bread seed", FoodType.SEEDS)));
		foods.addFood((new Food("chia seed", FoodType.SEEDS)));
		foods.addFood((new Food("peanut", FoodType.NUTS)));
		foods.addFood((new Food("walnut", FoodType.NUTS)));
		foods.addFood((new Food("almond", FoodType.NUTS)));
		foods.addFood((new Food("chestnut", FoodType.NUTS)));
		foods.addFood((new Food("wheat", FoodType.CEREAL)));
		foods.addFood((new Food("barley", FoodType.CEREAL)));
		foods.addFood((new Food("oats", FoodType.CEREAL)));
		foods.addFood((new Food("pearl millet", FoodType.CEREAL)));
		foods.addFood((new Food("finger millet", FoodType.CEREAL)));
		return foods;
	}
}
