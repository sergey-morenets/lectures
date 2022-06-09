package capgemini.spring.boot;

import capgemini.spring.boot.config.UserCredentials;
import capgemini.spring.boot.repository.OrderRepository;
import capgemini.spring.boot.service.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    @ConfigurationProperties("app")
    public UserCredentials userCredentials() {
        return new UserCredentials();
    }

    @Bean
    public OrderRepository orderRepository() {
        return new OrderRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderService(orderRepository());
    }
}
