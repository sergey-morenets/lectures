package capgemini.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("application.properties")
public class CustomConfiguration {

    @Bean
    @Qualifier("file")
    FileLogger fileLogger(Environment env) {
        return new FileLogger(env.getProperty("file.path2", "/opt/log.txt"));
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
