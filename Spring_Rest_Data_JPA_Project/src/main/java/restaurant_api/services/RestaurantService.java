package restaurant_api.services;

import java.util.Collection;
import java.util.Optional;
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
//		 Collection<Restaurant> allreop=  repoRef.findAll();
		return repoRef.findAll();
	}

	// get One Restaurant
	public Restaurant getOneRestaurant(String rId) {
		Restaurant foundRestaurant = null;
		// value may me present may not be persent null not back to return
		Optional<Restaurant> restaurantOptional = repoRef.findById(rId);
		if (restaurantOptional.isPresent())// is value resent
			foundRestaurant = restaurantOptional.get();
		return foundRestaurant;
	}

	// Post create Restaurant
	public void createNewReataurant(Restaurant restaurantObject) { // new
		repoRef.save(restaurantObject);// session.persist(object)
	}

	public void updateExistingReataurant(Restaurant restaurantObject) {// update
		repoRef.save(restaurantObject);
	}

	// save() method perform UPSERT operation (update/insert)
	public void deleteOneRestaurant(String rid) {
		System.out.println("\ndelete by id restaurant");
		repoRef.deleteById(rid);

	}
}
