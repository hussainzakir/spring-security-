package com.mvc.security;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.mvc.beans.UserTableData;
import com.mvc.dao.UserTableDataDao;


@Configuration
@EnableWebSecurity
public class MySecurity extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UserTableDataDao userDao;
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Override
	   protected void configure(HttpSecurity http) throws Exception {
	       http
	       .authorizeRequests()
           .antMatchers("/login").permitAll()
           .anyRequest().authenticated()
           .and()
           .formLogin()
           .loginPage("/login")
           .defaultSuccessUrl("/home")	
           .permitAll()
           .and()
           .logout()
           .logoutUrl("/logout")
           .invalidateHttpSession(true)
           .permitAll();
	   }
	
	

}
