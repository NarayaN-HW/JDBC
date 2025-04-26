package example.spring.core.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config5.xml");

		Object objCar = ctx.getBean("carbean");
		System.out.println(objCar);
	}
}
