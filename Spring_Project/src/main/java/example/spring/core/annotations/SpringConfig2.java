package example.spring.core.annotations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class SpringConfig2 {

	@Bean("mybean")
	public MyclassEAGER getMYClass() {
	    return new MyclassEAGER();
	}

	@Bean("mybean2")
	@Lazy
	public MyclassEAGER getMYClassLazy() {
	    return new MyclassEAGER();
	}

}
