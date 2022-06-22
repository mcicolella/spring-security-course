package net.emmecilab.players.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

	@Bean
	public UserDetailsService userDetailService() {

		UserDetails user1 = User.withDefaultPasswordEncoder()
				.username("user1")
				.password("pwduser1")
				.roles("USER")
				.build();
		
		UserDetails admin = User.withDefaultPasswordEncoder()
				.username("admin")
				.password("pwdadmin")
				.roles("ADMIN")
				.build();

		return new InMemoryUserDetailsManager(user1, admin);
	}
}
