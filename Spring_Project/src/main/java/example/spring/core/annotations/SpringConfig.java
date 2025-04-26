package example.spring.core.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import example.spring.core.GreetingService;
import example.spring.core.HelloService;
import example.spring.core.WelcomeService;

@Configuration // marks as a configuration unit
public class SpringConfig {// Acts as a configuration unit

	// bean decaare spring env
	@Bean // marks this method as a bean declaration method
	public GreetingService hello() {
		GreetingService gs = new HelloService(); // to retrun class obj
		return gs;
	}
@Bean("welbean") // customize id
	public GreetingService welcome() {
		GreetingService gs = new WelcomeService(); 
		return gs;
	}

}
