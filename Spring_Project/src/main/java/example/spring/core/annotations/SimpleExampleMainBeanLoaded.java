package example.spring.core.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import example.spring.core.GreetingService;

public class SimpleExampleMainBeanLoaded {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig2.class);

		Object o = ctx.getBean("mybean");
		GreetingService obj = (GreetingService) o;
		System.out.println(obj.sayGreeting());
	}
}
