package capgemini.monolith.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ConfigurationProperties
@Validated
public class UserInfo {
    @NotNull
    @Size(min = 8, max = 32)
    private String login;

    private String password;
}
