package restaurant_api.controller;

import java.util.Collection;
import org.springframework.web.bind.annotation.RestController;
import restaurant_api.entity.Restaurant;
import restaurant_api.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController// @controller @responseBody
public class RestaurantController {
	@Autowired // managed componenet
	private RestaurantService restServiceRef;

	// get all restaurant
	@GetMapping("/restaurants") // endpoint or url
	public Collection<Restaurant> getRestaurantController() {
		return restServiceRef.getAllRestaurants();
	}
	
	// get One Restaurant
	@GetMapping("/restaurants/{ID}")//		localhost:9090/restaurants/r02
	public Restaurant getOneRestaurant(@PathVariable("ID") String rid) {
		System.out.println("new request sent");
		return restServiceRef.getOneRestaurant(rid);
	}
	
	// Post create Restaurant
	@PostMapping("/restaurants") // not colfict with first getmapping restaurant.
	public void createNewReataurant(@RequestBody Restaurant restaurantObject) {
		System.out.println("new objected Recived"+ restaurantObject);
		restServiceRef.createNewReataurant( restaurantObject);
	}
	/*2025-04-28T10:53:32.699+05:30  WARN 16432 --- [Spring_Rest_Project] [io-9090-exec-10] .w.s.m.s.DefaultHandlerExceptionResolver : Resolved [org.springframework.http.converter.HttpMessageNotReadableException: Required request body is missing: public void restaurant_api.controller.RestaurantController.createNewReataurant(restaurant_api.entity.Restaurant)]
new objected RecivedRestaurant [restaurantId=r06, name=Sharavan, cuisine=Indian, branches=0]
	  */
}
