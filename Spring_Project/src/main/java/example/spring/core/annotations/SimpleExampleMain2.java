package example.spring.core.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import example.spring.core.GreetingService;

public class SimpleExampleMain2 {

	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(SpringConfig.class);

		
		
		Object obj = ctx.getBean("welbean");
		GreetingService gd = (GreetingService) obj;
//		if i only print gd return example.spring.core.HelloService@6f1c29b7
		System.out.println(gd.sayGreeting());
	}
}
