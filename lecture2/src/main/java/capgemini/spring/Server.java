package capgemini.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@RequiredArgsConstructor
public class Server {

    private final Logger logger;

    public Server(@Qualifier("console") Logger logger) {
        this.logger = logger;

        System.out.println("Logger is " + logger.getClass().getSimpleName());
    }

    public void start() {
        logger.write("Server started");
    }

    public void stop() {
        logger.write("Server stopped");

    }
}
