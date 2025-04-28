package restaurant_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RestaurantNotFoundException extends RuntimeException {
	public RestaurantNotFoundException(String msg) {
		super(msg); // display 500 internal server error if i add @responseStatus give proper status
	}
}
