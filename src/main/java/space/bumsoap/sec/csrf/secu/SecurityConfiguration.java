package space.bumsoap.sec.csrf.secu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SecurityConfiguration implements WebMvcConfigurer{
	
	// @formatter:off
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
					authorize -> authorize
						.requestMatchers("/", "/**").permitAll())
			  .formLogin(form -> form.loginPage("/login"));
		//http.csrf(fn -> fn.disable());
		return http.build();
	}
	// @formatter:on

}
