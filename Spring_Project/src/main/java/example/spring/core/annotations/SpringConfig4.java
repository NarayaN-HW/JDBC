package example.spring.core.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import example.spring.core.UserService;
import example.spring.core.autowiring.Car;
import example.spring.core.autowiring.Engine;
import example.spring.core.autowiring.Tyre;

@Configuration
public class SpringConfig4 {
// autowired in car class which  depend to other class

	// @Bean
	public Tyre getTyreBean() {
		return new Tyre("MUSTANG", "SPIKES");

	}

	// multiple engine beans
	@Bean("enginebean1")
	@Primary // not work beacuse @qualifer applied in fields  
	public Engine getEngineBean1() {
		return new Engine("petrol", "1600 cc");

	}

	@Bean("enginebean2")
	public Engine getEngineBean2() {
		return new Engine("Desial", "1400 cc");

	}

	@Bean("carbeandefault")
	public Car getCarBean() {
		return new Car();
	}

	@Bean("carbean")
	public Car getCarBean2() {
		Car c = new Car();
		c.setCarId("c001");
		c.setMake("Hunday");
		c.setModel("vena");
		return c;
	}

}
