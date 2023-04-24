package com.byaj.pathways.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final LogoutHandler logoutHandler;

    public SecurityConfig(LogoutHandler logoutHandler) {
        this.logoutHandler = logoutHandler;}

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                // allow all users to access the home pages and the static images directory
                .mvcMatchers("/", "/add", "/api/csv/upload", "/api/csv/upload/**","/browse", "/search", "/browse/**", "/jobdetail2", "/jobdetail/**",
                        "/jobdetail", "/jobdetail2/**","/css/**", "/media/**", "/js/**", "/plugins/**", "/fonts/**", "/webfonts/**").permitAll()
                // all other requests must be authenticated
                .anyRequest().authenticated()
                .and().oauth2Login()
                .and().logout()
                // handle logout requests at /logout path
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                // customize logout handler to log out of Auth0
                .addLogoutHandler(logoutHandler);
    }
}
