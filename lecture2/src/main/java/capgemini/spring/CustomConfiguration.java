package capgemini.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
public class CustomConfiguration {

    @Bean
    @Qualifier("file")
    FileLogger fileLogger() {
        return new FileLogger();
    }

    @Bean
    @Qualifier("console")
    ConsoleLogger consoleLogger() {
        return new ConsoleLogger();
    }

    @Bean
    Server server(@Qualifier("file") Logger logger) {
        return new Server(logger);
    }

    @Bean
    Sender sender() {
        return new Sender();
    }


}
