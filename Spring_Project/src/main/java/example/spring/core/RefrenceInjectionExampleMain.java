package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefrenceInjectionExampleMain {

	public static void main(String[] args) {
		String configpath = "spring-config2.xml";
		ApplicationContext ap = new ClassPathXmlApplicationContext(configpath);
		Object loadedCustomer = ap.getBean("customerBean");
		System.out.println(loadedCustomer.toString());
	}

}
