package example.spring.core;

// spring pojo depends user define api or interfaces
public class WelcomeService implements GreetingService {

	@Override
	public String sayGreeting() {

		return "Welcome, bhai";
	}

}
