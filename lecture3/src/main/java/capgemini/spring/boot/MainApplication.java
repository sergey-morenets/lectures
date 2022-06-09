package capgemini.spring.boot;

import capgemini.spring.boot.config.UserCredentials;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public UserCredentials userCredentials(Environment env) {
        return new UserCredentials(env);
    }
}
