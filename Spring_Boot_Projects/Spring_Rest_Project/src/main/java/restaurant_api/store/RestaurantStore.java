package restaurant_api.store;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import restaurant_api.entity.Restaurant;

public class RestaurantStore {

	private static Map<String, Restaurant> allrest;
	static {
		allrest = new HashMap<>();
		Restaurant r1 = new Restaurant("r01", "Puran Podi", "Indian Marathi", 100);
		Restaurant r2 = new Restaurant("r02", "Punjabi Rasoi", "Indian Panjabi", 54);
		Restaurant r3 = new Restaurant("r03", "Chinese", "Mainland China", 50);
		Restaurant r4 = new Restaurant("r04", "Vitthal Kamat", "India", 15);
		Restaurant r5 = new Restaurant("r05", "Icecream", "India", 150);
		allrest.put(r1.getRestaurantId(), r1);
		allrest.put(r2.getRestaurantId(), r2);
		allrest.put(r3.getRestaurantId(), r3);
		allrest.put(r4.getRestaurantId(), r4);
		allrest.put(r5.getRestaurantId(), r5);

	}

	public static Collection<Restaurant> getAllRestaurent() {
		Collection<Restaurant> restCollection = allrest.values();
		return restCollection;
	}
}
