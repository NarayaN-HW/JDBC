package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLoadingMainEAGER {

	public static void main(String[] args) {
// application context initalize
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config3.xml");
		
		System.out.println("lazy loading you have to call lazy");
		ctx.getBean("mybean4");
		
	}

}
