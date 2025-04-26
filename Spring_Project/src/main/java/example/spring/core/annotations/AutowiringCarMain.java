package example.spring.core.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiringCarMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig4.class);
		Object carobj = ctx.getBean("carbeandefault");
		Object carobj2 = ctx.getBean("carbean");
		System.out.println(carobj);
		System.out.println("-----------------------------------------------------\n");
		System.out.println(carobj2);
	}
}
