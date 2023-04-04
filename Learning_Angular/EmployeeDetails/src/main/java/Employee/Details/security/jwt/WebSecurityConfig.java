package Employee.Details.security.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationConverter;
import org.springframework.security.web.authentication.AuthenticationFilter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import Employee.Details.Service.UserDetailsServiceImpl;
import jakarta.servlet.Filter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

	@Autowired
    private AuthEntryPointJwt unauthorizedHandler;

    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) 
                   throws Exception {

        http.cors().and().csrf().disable().exceptionHandling()
           .authenticationEntryPoint((AuthenticationEntryPoint) unauthorizedHandler).and()
                .sessionManagement().sessionCreationPolicy
                    (SessionCreationPolicy.STATELESS).and()
                         .authorizeRequests()
                              .requestMatchers("/api/auth/**")
                                 .permitAll()
                                      .requestMatchers("/api/test/**")
                        .permitAll().anyRequest().authenticated();

//        http.addFilterBefore(authenticationJwtTokenFilter(), 
//                   UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

//    @Bean
//    public Filter authenticationJwtTokenFilter() {
//		
//		return authenticationJwtTokenFilter();
//	}

	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    @Bean
//    public AuthenticationFilter authenticationJwtTokenFilter() {
//        return authenticationJwtTokenFilter();
//    }

    @Bean
    public AuthenticationManager authenticationManager
        (AuthenticationConfiguration authenticationConfiguration)
            throws Exception {
        return authenticationConfiguration
                           .getAuthenticationManager();
    }	
}
