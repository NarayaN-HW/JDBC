package example.spring.core.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import example.spring.core.GreetingService;

public class SimpleExampleMain {

	// access anywhere
			// without obj used to run
				// no return
						// entry point
						   // command line
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext();
		ctx.register(SpringConfig.class);
		ctx.refresh(); //once register is dont change to applyed to call refresh()
		
		
		Object obj = ctx.getBean("hello");
		GreetingService gd = (GreetingService) obj;
//		if i only print gd return example.spring.core.HelloService@6f1c29b7
		System.out.println(gd.sayGreeting());
	}
}
