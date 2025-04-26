package example.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect // mark this class as an aspect
public class AudienceWithAround {
	// private to not participate execotion marker method
	@Pointcut("execution (* example.spring.aop.*.perform(..))")

	private void myPointCut() {
	}

	private void takeSeats() { // WHAT to do
		System.out.println("Please take seats. :Around");
	}

	private void turnOffMobile() { // WHAT to do
		System.out.println("Please Turn Off Mobiles. :Around");
	}

	private void clap() {
		System.out.println("Clap Clap Clap.  :Around");
	}

	private void demandForRefund() {
		System.out.println("Please Give my money Back. :Around");
	}

	private void leave() {
		System.out.println("Leave Now.  :Around");
	}

	@Around("myPointCut()")
	public void monitorPerformance(ProceedingJoinPoint joinpoint) {
		try {
			takeSeats();
			turnOffMobile();
			joinpoint.proceed();
			clap();
		} catch (Throwable e) {
			demandForRefund();
			e.printStackTrace();
		}
		leave();
	}
}
