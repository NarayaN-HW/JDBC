package example.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopExampleMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringAopConfig.class);
		Musician musicianobj = ctx.getBean(Musician.class);
		musicianobj.perform();
		System.out.println("------------------------\n");
		Singer singerobj = ctx.getBean(Singer.class);
		singerobj.perform();
		System.out.println("-----------------------------------------------\n");
		// Printing the names of classes of the objects to which
		//refrences: musicianobj and singerobj refer
		System.out.println(musicianobj.getClass().getName()); // get an proxy created by spring
//		example.spring.aop.Musician$$SpringCGLIB$$0 // code generate library
		System.out.println(singerobj.getClass().getName());
		 
	}
}
