package capgemini.security.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
        //TODO investigate missing password check
    UserDetailsService userDetailsService(PasswordEncoder encoder) {
        var userDetailsService = new InMemoryUserDetailsManager();

        UserDetails admin = User.builder().username("admin")
                .passwordEncoder(encoder::encode)
                .password("admin").roles("ADMIN").build();
        userDetailsService.createUser(admin);

        UserDetails user = User.builder().username("user").password("user")
                .passwordEncoder(encoder::encode)
                .roles("USER").build();
        userDetailsService.createUser(user);

        return userDetailsService;
    }
}
