package capgemini.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
//@ComponentScan("capgemini.spring")
public class CapgeminiConfiguration {

    @Bean
    public String string() {
        return "our bean";
    }

    @Bean
    @Primary
    public Writer dbWriter() {
        return new DbWriter();
    }

    @Bean
    public Writer consoleWriter() {
        return new ConsoleWriter();
    }

//    @Autowired
//    private Writer writer;

    @Bean
    public ProductAPI productAPI(Writer writer) {
        return new ProductAPI(writer);
    }
}
