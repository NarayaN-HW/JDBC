package restaurant_api.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import restaurant_api.entity.Restaurant;
import restaurant_api.exception.RestaurantNotFoundException;
import restaurant_api.services.RestaurantService;

@RestController // @controller @responseBody
public class RestaurantController {
	@Autowired // managed componenet
	private RestaurantService restServiceRef;

	@GetMapping("/restaurants") // endpoint or url
	public Collection<Restaurant> getRestaurantController() {
		return restServiceRef.getAllRestaurants();
	}

	@GetMapping("/restaurants/{ID}") // localhost:9090/restaurants/r02
	public Restaurant getOneRestaurant(@PathVariable("ID") String rid) {
		System.out.println("\nnew request sent");
		Restaurant foundRestaurant=restServiceRef.getOneRestaurant(rid);
		if(foundRestaurant==null)
//			throw new RuntimeException("Restaurant With Given ID Does Not Exist.");
			throw new RestaurantNotFoundException("Restaurant With Given ID Does Not Exist.");
		return foundRestaurant;
	}

	@PostMapping("/restaurants") // not colfict with first getmapping restaurant.
	public void createNewReataurant(@RequestBody Restaurant restaurantObject) {
		System.out.println("\nnew objected Recived" + restaurantObject);
		restServiceRef.createNewReataurant(restaurantObject);
	}

	@PutMapping("/restaurants")
	public void updateReataurant(@RequestBody Restaurant restaurantObject) {
		System.out.println("\nnew objected Recived to upserat(update/insert)" + restaurantObject);
		restServiceRef.updateExistingReataurant(restaurantObject);
	}

	@DeleteMapping("/restaurants/{rid}")// if pathvarialbe name and local var name same 
	public void deleteOneRestaurant(@PathVariable String rid) {
		restServiceRef.deleteOneRestaurant(rid);
	}
}
