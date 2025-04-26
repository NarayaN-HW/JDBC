package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScope1SingletoneMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config4.xml");
		Object obj = ctx.getBean("mybean");
		Object obj2 = ctx.getBean("mybean");

		// singletone default scome both obj share same references
		System.out.println("Is Singleton: " + (obj == obj2));

		System.out.println("------------------\n");
		// prototype bean scope="prototype" 
		obj = ctx.getBean("mybean2");
		obj2 = ctx.getBean("mybean2");
		System.out.println("Is prototype: " + (obj == obj2));
	}

}
