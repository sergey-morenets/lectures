package capgemini.spring.boot.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import javax.annotation.PostConstruct;

@Getter
@RequiredArgsConstructor
@ToString
@ConstructorBinding
@ConfigurationProperties("security")
public class SecurityConfiguration {

    private final String secretKey;

    private final String secretToken;

    @PostConstruct
    void init() {
        System.out.println("Security configuration: " + toString());
    }
}
