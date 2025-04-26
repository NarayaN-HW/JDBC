package example.spring.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @Configuration @ComponenetScan @EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = {"rest_impl","restaurant_api"})
public class SpringRestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestProjectApplication.class, args); // start tomcat server
	}

}
