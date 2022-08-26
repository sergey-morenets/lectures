package capgemini.spring;

import org.springframework.stereotype.Component;

@Component
//@Repository
//@Service
//@Controller
public class ConsoleLogger implements Logger {

    public void write(String message) {
        System.out.println("Write to console, message:" + message);

    }
}
