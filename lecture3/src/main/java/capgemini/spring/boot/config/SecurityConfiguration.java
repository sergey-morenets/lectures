package capgemini.spring.boot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfiguration {

    @Value("${secretKey}")
    private String secretKey;

    @Value("${secretToken}")
    private String secretToken;
}
