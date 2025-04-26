package example.spring.core.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import example.spring.core.UserService;

@Configuration
public class SpringConfig3 {

	@Bean("userService")
	public UserService getUserService() {
		UserService us = new UserService();
		us.setName("narayan");
		us.setMessage("hello");
		us.setAge(23);
		return us;
	}

	@Bean("userService2")
	@Scope("prototype")
	public UserService getUserService2() {
		UserService us = new UserService(23, "shiva", "namaste");
		return us;
	}

}
