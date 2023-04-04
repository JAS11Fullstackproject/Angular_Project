//package Employee.Details;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.web.server.Http2;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//
//@EnableWebSecurity
//public class SecurityConfigurations extends WebSecurityConfigurerAdapter{
//
//	
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
//		authenticationMgr.inMemoryAuthentication()
//			.withUser("jduser").password("jdu@123").authorities("ROLE_USER")
//			.and()
//			.withUser("jdadmin").password("jda@123").authorities("ROLE_USER","ROLE_ADMIN");
//	}
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//
//		
//		http.authorizeRequests()
//			.requestMatchers("/homePage").access("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
//			.antMatchers("/userPage").access("hasRole('ROLE_USER')")
//			.antMatchers("/adminPage").access("hasRole('ROLE_ADMIN')")
//			.and()
//				.formLogin().loginPage("/loginPage")
//				.defaultSuccessUrl("/homePage")
//				.failureUrl("/loginPage?error")
//				.usernameParameter("username").passwordParameter("password")				
//			.and()
//				.logout().logoutSuccessUrl("/loginPage?logout"); 
//		
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
////	@Autowired
////	DataSource dataSource;
////	
////	@Override
////	  protected void configure(HttpSecurity http) throws Exception {
////	    http.antMatcher("/personal/**")
////	      .authorizeRequests()
////	        .antMatchers("/personal/getAll").hasRole("USER")
////	        .antMatchers("/personal/spam").hasRole("SPAM")
////	        .anyRequest().fullyAuthenticated();
////	  }
////	
////	@Override
////	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////		
////		PasswordEncoder encoder=PasswordEncoderFactories.createDelegatingPasswordEncoder();
////		
////		auth.jdbcAuthentication()
////			.dataSource(dataSource)
////			.withDefaultSchema()
////			.withUser("sathish")
////			.password(encoder.encode("kumar"))
////			.roles("USER")
////			.and()
////			.withUser("admin")
////			.password(encoder.encode("admin"))
////			.roles("ADMIN");
////			
////	}
//	
//	
//	
//}
