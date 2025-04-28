package restaurant_api.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restaurant_api.entity.Restaurant;
import restaurant_api.repo.RestaurantRepository;


@Service
public class RestaurantService {
	@Autowired // inject to repo to service
	private RestaurantRepository repoRef;

	
	// get all restaurant
	public Collection<Restaurant> getAllRestaurants() {
		return repoRef.getAllRestaurents();
	}
	// get One Restaurant
	public Restaurant getOneRestaurant(String rId) {
		return repoRef.getOneRestaurant(rId);		
	}
	
	// Post create Restaurant
	public void createNewReataurant(Restaurant restaurantObject) {
		repoRef.createNewReataurant(restaurantObject);
	}
}
