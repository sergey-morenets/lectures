package capgemini.spring.boot.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.annotation.PostConstruct;

@Getter
@RequiredArgsConstructor
@ToString
public class SecurityConfiguration {

    private final String secretKey;

    private final String secretToken;

    @PostConstruct
    void init() {
        System.out.println("Security configuration: " + toString());
    }
}
