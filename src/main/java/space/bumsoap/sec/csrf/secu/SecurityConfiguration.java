package space.bumsoap.sec.csrf.secu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SecurityConfiguration implements WebMvcConfigurer {

	// @formatter:off
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
					authorize -> authorize
						.requestMatchers("/", "/**").permitAll())
			  .formLogin(form -> form.loginPage("/login"));
		return http.build();
	}
	// @formatter:on

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/login");
	}
}
