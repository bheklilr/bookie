package edu.bheklilr.bookie.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    @Autowired
//    private UserDetailsService userDetailsService;
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
//        auth.inMemoryAuthentication().withUser("user").password("pass").roles("USER")
//                .and().withUser("admin").password("admin").roles("ADMIN");
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        System.out.println("#########################################################################################");
        System.out.println("#########################################################################################");
        System.out.println("#########################################################################################");
        System.out.println("#########################################################################################");
        System.out.println("Trying to see if this even works");
        System.out.println("#########################################################################################");
        http
                .authorizeRequests()
                    .antMatchers("/", "/static/**").permitAll()
                    .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login").permitAll();
    }
}