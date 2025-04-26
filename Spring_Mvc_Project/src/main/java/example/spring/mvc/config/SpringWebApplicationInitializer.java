package example.spring.mvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class SpringWebApplicationInitializer implements WebApplicationInitializer {

	private WebApplicationContext getContext() {
		System.out.println("webappcontext");
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		// this setconfiglocation to @ComponentScan(basepakages = {"example})
		ctx.setConfigLocation("example");
		return ctx;
	}

	@Override
	public void onStartup(ServletContext servletContextRef) throws ServletException {
		System.out.println("Application is starting up...");
		WebApplicationContext webctx = getContext();

		DispatcherServlet frontController = new DispatcherServlet(webctx);
		ServletRegistration.Dynamic registration = servletContextRef.addServlet("myFrontController", frontController);
		registration.addMapping("/");// every url start -> / accepting all requests
	}

}
