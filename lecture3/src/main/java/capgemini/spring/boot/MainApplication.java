package capgemini.spring.boot;

import capgemini.spring.boot.config.SecurityConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SecurityConfiguration.class)
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

//    @Bean
//    SecurityConfiguration securityConfiguration(Environment env) {
//        return new SecurityConfiguration(env.getRequiredProperty("secretKey"),
//                env.getProperty("secretToken"));
//    }
}
