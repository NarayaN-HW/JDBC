/*package example.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect // mark this class as an aspect
public class Audience {
	// private to not participate execotion marker method
//	@Pointcut("execution (* example.spring.aop.*.perform(..))") //m* start with m all classes *i* b/w i of name of classes
	@Pointcut("execution (* example.spring.aop.*i*.perform(..))")
	private void myPointCut() {
	}

	@Before("myPointCut()") // WHEN to do
	public void takeSeats() { // WHAT to do
		System.out.println("Please take seats.");
	}

	@Before("myPointCut()")
	public void turnOffMobile() { // WHAT to do
		System.out.println("Please Turn Off Mobiles.");
	}

	@AfterReturning("myPointCut()")
	public void clap() {
		System.out.println("Clap Clap Clap.");
	}

	@AfterThrowing("myPointCut()")
	public void demandForRefund() {
		System.out.println("Please Give my money Back.");
	}

	@After("myPointCut()")
	public void leave() {
		System.out.println("Leave Now.");
	}
}*/