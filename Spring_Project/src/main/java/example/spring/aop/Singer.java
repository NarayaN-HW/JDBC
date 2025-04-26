package example.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Singer {
	public void perform() {
		System.out.println("Singing A Song.......................");
//		throw new RuntimeException();
	}
}
