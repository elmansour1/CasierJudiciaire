/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faouzi.casierjudiciaire.security;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author elmansour
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{
      @Autowired
    public void globalConfig(AuthenticationManagerBuilder auth, DataSource dataSource) throws Exception{
//        auth.inMemoryAuthentication().withUser("admin").password("admin").roles("ADMIN");
          auth.jdbcAuthentication()
                  .dataSource(dataSource)
                  .usersByUsernameQuery("SELECT username as principal, password as credentials, true FROM users WHERE username = ?")
                  .authoritiesByUsernameQuery("SELECT users_username as principal, role_role as role FROM users_roles WHERE users_username = ?")
                  .rolePrefix("ROLE_");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http    
                .csrf().disable()
                .authorizeRequests()
                    .antMatchers("/css/**", "/Angular-Materialize/**", "/font-awesome-4.7.0/**","/images/**","/materialize/**", "/fonts/**", "/js/**","/static/**").permitAll()
                    .anyRequest()
                        .authenticated()
                            .and()
                .formLogin()
                    .loginPage("/login")
                    .defaultSuccessUrl("/index.html")
                    .failureUrl("/login")
                    .permitAll()
                    .and()
                .logout()
                    .invalidateHttpSession(true)
                    .logoutUrl("/logout")
                    .permitAll();
    }
    
}
