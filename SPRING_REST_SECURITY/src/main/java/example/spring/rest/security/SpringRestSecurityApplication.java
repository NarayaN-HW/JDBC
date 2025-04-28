package example.spring.rest.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootApplication
@EnableWebSecurity // enable web security that is customize using securityfilterchain
public class SpringRestSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestSecurityApplication.class, args);
	}

//		1 bean config Password Encoding :BCryptPassword Encoder
	@Bean
	public BCryptPasswordEncoder encode() {
		return new BCryptPasswordEncoder();

	}

	// 2 in memory USERs :UserDetailServices
	@Bean
	public UserDetailsService getUserDetailsService() {
		UserDetails user1 = User.withUsername("user")
				.password(encode().encode("asUser"))
				.roles("USER").build();
		
		UserDetails user2 = User.withUsername("admin")
				.password(encode().encode("asAdmin"))
				.roles("ADMIN").build();
		
		InMemoryUserDetailsManager userdetailsManager=
				new InMemoryUserDetailsManager(user1,user2);

		return userdetailsManager;
	}
	
	// security config : scurityFilterChain
// url and role mapping 
	@Bean
	public SecurityFilterChain getSecurityFilterChain(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests(
				auth -> {
					auth.requestMatchers("/Greeting").permitAll();
					auth.requestMatchers("/doUserWork").hasAnyRole("USER","ADMIN")
					.requestMatchers("/doAdminWork").hasAnyRole("ADMIN")
					.anyRequest().authenticated();
					}
				);
		http.formLogin(Customizer.withDefaults());
		http.httpBasic(Customizer.withDefaults());
		return http.build();
	}
}
