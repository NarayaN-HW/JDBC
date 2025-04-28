package restaurant_api.repo;

//it does not get scanned
import org.springframework.data.jpa.repository.JpaRepository;
import restaurant_api.entity.Restaurant;

//@Repository // is not required beacuse jparepository is laready managed componenet
public interface RestaurantRepository extends JpaRepository<Restaurant, String> { // it does not get scanned
	// jpa handle CRUD operations automatically
//additional methods if any depends upon domain

}
