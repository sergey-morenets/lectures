package capgemini.spring.boot.config;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@Getter
@Setter
@Slf4j
public class UserCredentials {

    public UserCredentials(Environment env) {
        login = env.getProperty("app.login");
        password = env.getProperty("app.password");
    }

    //@Value("${app.login:admin}")
    private String login;

    //@Value("${app.password}")
    private String password;

    @PostConstruct
    public void init() {
        //System.out.println("Our credentials are: login - " + );
        log.info("User login: {}, password: {}", login, password);
    }
}
