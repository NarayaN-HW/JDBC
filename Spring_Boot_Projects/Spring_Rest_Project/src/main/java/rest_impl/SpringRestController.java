package rest_impl;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {

//	public @ResponseBody String getGreeting() { // and class level @Controller -----INTERVIEW ALL NOTATION 
	@GetMapping("/doGreet")
	public String getGreeting() {
		return "Welcome to Spring REST -->";
	}

	@GetMapping("/doWish")
	public Message getMessage() {
		return new Message("Hello ", "This is Spring Boot Rest", LocalDate.of(2025, 04, 28));
	}

	@GetMapping("/doWishes")
	public Collection<Message> getMessages() {
		Message msgObj = new Message("Hello ", "This is Spring Boot Rest", LocalDate.of(2025, 04, 28));
		Message msgObj2 = new Message("Welcome ", " Narayan", LocalDate.of(2025, 04, 28));
		Message msgObj3 = new Message("All ", " this is collection", LocalDate.of(2025, 04, 28));
		Collection<Message> allmsg = Arrays.asList(msgObj, msgObj2, msgObj3);
		return allmsg;
	}

}
