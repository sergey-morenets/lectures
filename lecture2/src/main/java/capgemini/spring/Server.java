package capgemini.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
//@RequiredArgsConstructor
public class Server {

    private final Logger logger;

    // @Autowired
    private Sender sender;

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

    @Autowired
    public void setSender(Sender sender) {
        this.sender = sender;
    }

    @PostConstruct
    void init() {
        System.out.println("Sender is " + sender.getClass().getSimpleName());

    }


}
