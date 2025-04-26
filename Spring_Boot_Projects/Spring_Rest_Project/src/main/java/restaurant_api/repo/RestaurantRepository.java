package restaurant_api.repo;

import java.util.Collection;

import org.springframework.stereotype.Repository;
import restaurant_api.entity.Restaurant;
import restaurant_api.store.RestaurantStore;

@Repository
public class RestaurantRepository {

	public Collection<Restaurant> getAllRestaurents() {
//		Collection<Restaurant> allrest = RestaurantStore.getAllRestaurent();
//		return allrest;
		return RestaurantStore.getAllRestaurent();
	}
}
