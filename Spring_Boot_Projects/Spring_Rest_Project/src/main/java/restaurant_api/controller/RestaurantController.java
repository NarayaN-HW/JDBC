package restaurant_api.controller;

import java.util.Collection;
import org.springframework.web.bind.annotation.RestController;
import restaurant_api.entity.Restaurant;
import restaurant_api.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class RestaurantController {
	@Autowired // managed componenet
	private RestaurantService restServiceRef;

	@GetMapping("/restaurants")
	public Collection<Restaurant> getRestaurantController() {
		return restServiceRef.getAllRestaurants();
	}
}
