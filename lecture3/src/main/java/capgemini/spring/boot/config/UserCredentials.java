package capgemini.spring.boot.config;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

@Getter
@Setter
@Slf4j
public class UserCredentials {
    @Value("${app.login}")
    private String login;

    @Value("${app.password}")
    private String password;

    @PostConstruct
    public void init() {
        //System.out.println("Our credentials are: login - " + );
        log.info("User login: {}, password: {}", login, password);
    }
}
