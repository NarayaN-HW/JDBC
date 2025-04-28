package example.spring.rest.security;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SpringRestSecurityController {
	@GetMapping("/Greeting")
	public String getGreeting() {
		return "Welcome To Spring Security";
	}

	@GetMapping("/doUserWork")
	public String getUserWork() {
		return "doing User Work";
	}

	@GetMapping("/doAdminWork")
	public String getAdminWork() {
		return "Doing admin work";
	}

}
