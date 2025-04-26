package example.spring.core.annotations;


import org.springframework.stereotype.Component;

@Component // mark this class as a managed component so we don't create object
public class TestComponent {

	public void testComponenet() {
		System.out.println("Componenet Test Succeeded...");
	}
}
