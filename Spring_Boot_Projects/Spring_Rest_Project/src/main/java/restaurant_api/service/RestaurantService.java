package restaurant_api.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restaurant_api.entity.Restaurant;
import restaurant_api.repo.RestaurantRepository;

@Service
public class RestaurantService {
	@Autowired
	private RestaurantRepository repoRef;

	public Collection<Restaurant> getAllRestaurants() {
		return repoRef.getAllRestaurents();
	}
}
