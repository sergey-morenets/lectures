package capgemini.cloud.persistence;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    ApplicationRunner runner(DatabaseCreator databaseCreator) {
        return args -> databaseCreator.run();
    }
}
