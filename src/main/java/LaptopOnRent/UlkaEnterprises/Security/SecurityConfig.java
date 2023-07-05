package LaptopOnRent.UlkaEnterprises.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
       UserDetails user = User.withDefaultPasswordEncoder()
               .username("ultp")
               .password("ulka1234")
               .roles("ADMIN")
               .build();
       return new InMemoryUserDetailsManager(user);
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
       return   http.csrf(csrf -> csrf.disable()).authorizeRequests(auth -> {
                   try {
                       auth.requestMatchers("/admin").hasRole("ADMIN").requestMatchers("/")
                               .permitAll()
                               .and()
                               .formLogin()
                               .defaultSuccessUrl("/redirect")
                               .and()
                               .logout().logoutSuccessUrl("/")
                               .permitAll();
                   } catch (Exception e) {
                       e.printStackTrace();
                   }
               })
               .httpBasic(Customizer.withDefaults())
               .build();

    }
}
