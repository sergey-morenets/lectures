package capgemini.spring;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Server {

    private final Logger logger;

    public void start() {
        logger.write("Server started");
    }

    public void stop() {
        logger.write("Server stopped");

    }
}
