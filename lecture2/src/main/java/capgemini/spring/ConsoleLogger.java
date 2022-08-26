package capgemini.spring;

import org.springframework.beans.factory.annotation.Qualifier;

//@Component
//@Repository
//@Service
//@Controller
@Qualifier("console")
public class ConsoleLogger implements Logger {

    public void write(String message) {
        System.out.println("Write to console, message:" + message);

    }
}
