package example.spring.core;

// spring pojo depends user define api or interfaces
public class HelloService implements GreetingService {

	@Override
	public String sayGreeting() {

		return "Hello,\nThis is Spring SpringCORE module Program";
	}

}
