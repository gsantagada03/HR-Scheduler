package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/**
 * The SecurityConfiguration class configures the security settings for the application.
 * It defines authentication providers, password encoding, and security filter chains.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Autowired
    private AdminDetailsService adminDetailsService;

    @Autowired
    private CustomLoginSuccessHandler customLoginSuccessHandler;

    /**
     * Configures the security filter chain.
     *
     * @param httpSecurity the HttpSecurity object to configure.
     * @return the configured SecurityFilterChain.
     * @throws Exception if an error occurs while configuring the security settings.
     */
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .authorizeHttpRequests(registry -> {
                    registry.requestMatchers("/admin/**").hasRole("ADMIN");
                    registry.requestMatchers("/employee/**").hasRole("EMPLOYEE");
                    registry.requestMatchers("/manager/**").hasRole("HR_MANAGER");
                    registry.requestMatchers("/view/Login.jsp").permitAll();
                    registry.requestMatchers("/JS/*.js").permitAll();
                    registry.requestMatchers("/CSS/*.css").permitAll();
                    registry.requestMatchers("/images/**").permitAll();
                    registry.anyRequest().authenticated();
                })
                .formLogin(httpSecurityFormLoginConfigurer -> {
                    httpSecurityFormLoginConfigurer.loginPage("/login").permitAll()
                    .successHandler(customLoginSuccessHandler)
                    .failureUrl("/login?error=true")
                    .permitAll();
                })
                .build();
    }

    /**
     * Provides the UserDetailsService bean.
     *
     * @return the AdminDetailsService.
     */
    @Bean
    UserDetailsService userDetailsService() {
        return adminDetailsService;
    }

    /**
     * Configures the authentication provider.
     *
     * @return the configured DaoAuthenticationProvider.
     */
    @Bean
    AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(adminDetailsService);
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }

    /**
     * Provides the PasswordEncoder bean.
     *
     * @return the BCryptPasswordEncoder.
     */
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
