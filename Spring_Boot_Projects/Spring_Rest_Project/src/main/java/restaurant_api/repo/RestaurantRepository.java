package restaurant_api.repo;

import java.util.Collection;

import org.springframework.stereotype.Repository;
import restaurant_api.entity.Restaurant;
import restaurant_api.store.RestaurantStore;

@Repository
public class RestaurantRepository {

	// get all restaurant
	public Collection<Restaurant> getAllRestaurents() {
//		Collection<Restaurant> allrest = RestaurantStore.getAllRestaurent();
//		return allrest;
		return RestaurantStore.getAllRestaurent();
	}
	
	// get One Restaurant
	public Restaurant getOneRestaurant(String restId) {
		return RestaurantStore.getOneRestaurent(restId);
	}
	
	// Post create Restaurant
	public void createNewReataurant(Restaurant restaurantObject) {
		RestaurantStore.createNewRestaurant(restaurantObject);
	}
}
