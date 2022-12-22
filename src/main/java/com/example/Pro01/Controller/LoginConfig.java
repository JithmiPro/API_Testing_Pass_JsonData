package com.example.Pro01.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class LoginConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
        authenticationMgr.inMemoryAuthentication()
                .withUser("jm").password("123").authorities("ROLE_USER")
                .and()
                .withUser("jm2").password("123").authorities("ROLE_USER","ROLE_ADMIN");
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/TitleBar").access("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
                .antMatchers("/TitleBar").access("hasRole('ROLE_USER')")
                .antMatchers("/TitleBar").access("hasRole('ROLE_ADMIN')")
                .and()
                .formLogin().loginPage("/indexx")
                .defaultSuccessUrl("/Success")
                .failureUrl("/indexx?error")
                .usernameParameter("UserName").passwordParameter("Paw")
                .and()
                .logout().logoutSuccessUrl("/indexx?logout");

    }




}
