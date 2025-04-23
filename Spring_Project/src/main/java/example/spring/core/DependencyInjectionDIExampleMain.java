package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// setter injection
public class DependencyInjectionDIExampleMain {
	public static void main(String[] args) {
		// located bean
		String configPath = "spring-config.xml";// . <- current project

		// to use bean
		ApplicationContext ctx;

		// used class to loaded bean and id
		ctx = new ClassPathXmlApplicationContext(configPath);

		Object loadedObj = ctx.getBean("springBean3");

		GreetingService gs = (GreetingService) loadedObj;

		System.out.println(gs.sayGreeting());
		System.out.println("\n-------------------------\n");

		/// Unsatisfied dependency expressed through constructor parameter 2: Could not
		/// convert argument value of type [java.lang.String] to required type
		loadedObj = ctx.getBean("springBean4");
		gs = (GreetingService) loadedObj;
		System.out.println(gs.sayGreeting());
	}
}
