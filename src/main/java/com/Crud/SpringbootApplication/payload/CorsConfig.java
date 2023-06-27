//package com.Crud.SpringbootApplication.payload;
//
//import java.util.Arrays;
//
//import org.springframework.context.annotation.Bean;

//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class CorsConfig {
	
//	@Value("https:http://employee-management-client.s3-website.us-east-2.amazonaws.com")
//	@Value("http://localhost:4200")
//	private String allowedOrigin;
//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		
//		String[] allowDomains = new String[2];
//	   allowDomains[0] = "http://localhost:4200";
//	   allowDomains[1] = "http://localhost:8084";
//		
//		return new WebMvcConfigurer() {
//		@Override
//		public void addCorsMappings(CorsRegistry registry) {
//			registry.addMapping("/**")
//			.allowedOriginPatterns("*")
//			.allowedOrigins(allowDomains)
//			.allowedMethods("*")
//			.allowedHeaders("*")
//			.exposedHeaders("*")
//			;
//			}
//		};
//	}
	
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//import java.util.Arrays;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//
//@Configuration
//public class CorsConfig {

//  @Bean
//  public CorsFilter corsFilter() {
//    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//    CorsConfiguration config = new CorsConfiguration();
//    config.setAllowedOrigins(Arrays.asList("*"));
//    config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
//    config.setAllowedHeaders(Arrays.asList("authorization", "content-type", "x-auth-token","Access-Control-Allow-Origin"));
//    config.setExposedHeaders(Arrays.asList("x-auth-token"));
//    source.registerCorsConfiguration("/**", config);
//    return new CorsFilter(source);
//  }
//}

//  @SuppressWarnings("deprecation")
//@Bean
//  public WebMvcConfigurer corsConfigurer() {
//    return new WebMvcConfigurerAdapter() {
//      @Override
//      public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**").allowedOrigins("*");
//      }
//    };
//  }
//}


