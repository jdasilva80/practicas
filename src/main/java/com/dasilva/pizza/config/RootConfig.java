package com.dasilva.pizza.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebSecurity
@ComponentScan(basePackages = { "com.dasilva.pizza" }, excludeFilters = {
		@Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class) })
public class RootConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication() // habilita repositorio de usuarios en memoria
				.withUser("admin1").password("admin1").roles("USER_ADMIN").and().withUser("user1").password("user1")
				.authorities("ROLE_USER");

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.formLogin().and().logout().logoutSuccessUrl("/")
		.and().authorizeRequests().antMatchers("/pedi**").hasRole("USER_ADMIN").anyRequest().permitAll();
				//.and().requiresChannel().antMatchers("/pedido**").requiresSecure();

		// http.authorizeRequests().regexMatchers("/pedido.*").authenticated().and().httpBasic();
		// requiresChannel().antMatchers("/pedido**").requiresInsecure().and().

	}
}
