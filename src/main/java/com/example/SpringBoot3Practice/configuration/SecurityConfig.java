package com.example.SpringBoot3Practice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable);
        http.authorizeHttpRequests(authorize -> {
            authorize
                    .requestMatchers("/abc").permitAll()
                    .anyRequest().authenticated();

        });
        http.formLogin(form -> {
            form.defaultSuccessUrl("/secret");
        });
        return http.build();

    }

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        String username="user";
        String password="";

        UserDetails user = User.withUsername(username).password("").roles("User").build();

        return new InMemoryUserDetailsManager(user);
    }

}
