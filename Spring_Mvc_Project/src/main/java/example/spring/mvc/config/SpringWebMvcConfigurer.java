package example.spring.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc // enable web MVC support
public class SpringWebMvcConfigurer implements WebMvcConfigurer { // WebMvcConfigurer marker interface so on
																	// unimplemented method
	@Bean
	public ViewResolver getViewResolver() {
		System.out.println("get view resolver");
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		String prefix = "/WEB-INF/views/";
		String sufix = ".jsp";
		viewResolver.setPrefix(prefix);
		viewResolver.setSuffix(sufix);
		return viewResolver;
	}

}
