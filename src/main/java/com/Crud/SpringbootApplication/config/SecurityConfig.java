package com.Crud.SpringbootApplication.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.AllArgsConstructor;

@EnableWebSecurity
@AllArgsConstructor

//public class SecurityConfig  {
//public void configure(HttpSecurity httpSecurity) throws Exception{
//        httpSecurity.csrf().disable()
//        .authorizeRequests()
//        .antMatchers("/api/**").permitAll()
//        .antMatchers("/api2/**").permitAll()
//        .antMatchers("/api3/**").permitAll();
//        
//}


@Configuration
@EnableWebMvc

public class SecurityConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/**")
                .allowedOrigins("*")
                .exposedHeaders("*")
                .allowedMethods("*")
                .allowedOrigins("http://localhost:4200")
                .maxAge(3600)
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .exposedHeaders("Authorization")
                .allowCredentials(true);
    	}
	}
