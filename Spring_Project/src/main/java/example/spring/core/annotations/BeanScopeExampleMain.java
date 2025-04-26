package example.spring.core.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import example.spring.core.GreetingService;
import example.spring.core.UserService;

public class BeanScopeExampleMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig3.class);

		Object o = ctx.getBean("userService");
		Object obj = ctx.getBean("userService");
		System.out.println("singletone " + (o == obj));
		System.out.println("----------------\n");
		o = ctx.getBean("userService2");
		obj = ctx.getBean("userService2");
		System.out.println("singletone " + (o == obj));
	}
}
