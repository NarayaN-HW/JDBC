package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringSimpleGreetignMain2 {
	public static void main(String[] args) {
		// located bean
		String configPath = "spring-config.xml";// . <- current project

		// to use bean
		ApplicationContext ctx;

		// used class to loaded bean and id
		ctx = new ClassPathXmlApplicationContext(configPath);
		
		Object loadedObj = ctx.getBean("springBean");
		Object loadedObj2 = ctx.getBean("springBean2");

		// type cast object to relative class
//		interface implements typecast is loose coupling
//		class extends typecast is tight coupling
		GreetingService gs = (GreetingService) loadedObj;
		GreetingService gs2 = (GreetingService) loadedObj2;
		
		System.out.println(gs.sayGreeting());
		System.out.println(gs2.sayGreeting());
		System.out.println("\n-------------------------\n");
		
		/* Unmanaged
		GreetingService gs2 = new HelloService();
		System.out.println(gs2.sayGreeting());*/
	}
}
