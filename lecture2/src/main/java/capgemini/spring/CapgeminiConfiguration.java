package capgemini.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CapgeminiConfiguration {

    @Bean
    public String string() {
        return "our bean";
    }

    @Bean
    public Writer dbWriter() {
        return new DbWriter();
    }

    @Bean
    public Writer consoleWriter() {
        return new ConsoleWriter();
    }

    @Autowired
    private Writer writer;

    @Bean
    public ProductAPI productAPI() {
        return new ProductAPI(writer);
    }
}
