package capgemini.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class BeanstalkApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanstalkApplication.class, args);
    }

    @GetMapping
    public String hello() {
        return "Hello from Capegemini";
    }
}
