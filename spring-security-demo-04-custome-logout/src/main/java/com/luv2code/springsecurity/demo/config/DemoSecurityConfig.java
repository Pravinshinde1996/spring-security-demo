package com.luv2code.springsecurity.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

	@SuppressWarnings("deprecation")
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		
		
		  UserBuilder user=User.withDefaultPasswordEncoder();
		  auth.inMemoryAuthentication()
		  .withUser(user.username("pravin").password("pravin").roles("M"))
		  .withUser(user.username("sanket").password("sanket").roles("SM"));
		 
		 
		
		//UserBuilder userBuilder = User.withUsername("pravin").password("pravin").roles("M");
		//auth.inMemoryAuthentication().withUser(userBuilder);

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.and()
			.formLogin()
			 .loginPage("/showMyLoginPage")
			 .loginProcessingUrl("/authenticateTheUser")
			 .permitAll()
		.and()
			.logout()
			.permitAll();
	}
	
	

}
