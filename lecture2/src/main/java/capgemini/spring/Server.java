package capgemini.spring;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

//@Component
//@RequiredArgsConstructor
@Getter
public class Server {

    private final Logger logger;

    private boolean started;

    // @Autowired
    private Sender sender;

    public Server(Logger logger) {
        this.logger = logger;

        System.out.println("Logger is " + logger.getClass().getSimpleName());
    }

    public void start() {
        logger.write("Server started");

        started = true;
    }

    public void stop() {
        logger.write("Server stopped");
        started = false;
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
