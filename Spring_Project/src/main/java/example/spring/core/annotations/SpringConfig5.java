package example.spring.core.annotations;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"example.Food_item","example"}) // example is high pkg 
@ComponentScan(basePackageClasses = TestComponent.class) // or @ComponentScan of same pgk
public class SpringConfig5 {


}
