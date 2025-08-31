
package com.example.SpringMailSender.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;


@Configuration
@EnableMethodSecurity
public class WebSecurity {
	
	@Bean
	public SecurityFilterChain createSecurityFilter(HttpSecurity http) throws Exception 
	{
		http.authorizeHttpRequests(auth->auth
				                    .requestMatchers("/SendMail","/SaveData").permitAll()
				                    .requestMatchers("/app/user/update").authenticated()
				                    .anyRequest().authenticated())
		    .csrf(csrf->csrf.disable())
		    .cors().and()
		    .httpBasic(basic->basic.disable());
		
		
		return http.build();
	}
	
	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
	    CorsConfiguration config = new CorsConfiguration();
	    config.addAllowedOrigin("http://localhost:3000"); // or specific origins
	    config.addAllowedHeader("*");
	    config.addAllowedMethod("*");
	    config.setAllowCredentials(true); // Optional, see notes above

	    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	    source.registerCorsConfiguration("/**", config);
	    return source;
	}

}

