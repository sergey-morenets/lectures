package capgemini.spring.boot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.annotation.PostConstruct;

@ConfigurationProperties("security")
public record SecurityConfiguration(String secretKey, String secretToken) {

    @PostConstruct
    void init() {
        System.out.println("Security configuration: " + toString());
    }
}
