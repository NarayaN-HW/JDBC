package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSimpleGreetignMain {
	public static void main(String[] args) {
		// located bean
		String configPath = "./src/main/resources/spring-config.xml";// . <- current project

		// to use bean
		ApplicationContext ctx;

		// used class to loaded bean and id
		ctx = new FileSystemXmlApplicationContext(configPath);
		
		Object loadedObj = ctx.getBean("springBean");

		// type cast object to relative class
//		interface implements typecast is loose coupling
//		class extends typecast is tight coupling
		GreetingService gs = (GreetingService) loadedObj;
		
		System.out.println(gs.sayGreeting());
		System.out.println("\n-------------------------\n");
		
		/* Unmanaged
		GreetingService gs2 = new HelloService();
		System.out.println(gs2.sayGreeting());*/
	}
}
