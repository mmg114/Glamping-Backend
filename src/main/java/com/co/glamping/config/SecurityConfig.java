package com.co.glamping.config;

import com.co.glamping.auth.jwt.JwtAuthenticationFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {


    private final JwtAuthenticationFilter jwtAuthenticationFilter;
    private final AuthenticationProvider authProvider;
  public SecurityFilterChain filtarChain(HttpSecurity http) throws Exception {

      return http
              .csrf(csrf->csrf.disable())
              .authorizeHttpRequests(authRequest ->
                      authRequest
                              .requestMatchers("/auth/**").permitAll()
                              .anyRequest().authenticated()
              )
              .sessionManagement(sessionManager->
                      sessionManager
                              .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
              .authenticationProvider(authProvider)
              .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
              .build();
  }
}
