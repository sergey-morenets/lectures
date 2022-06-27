package capgemini.kafka;

import org.springframework.stereotype.Component;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

@Component
public class EmailService {

    private final Queue<String> queue = new LinkedBlockingQueue<>();

    public void run() throws InterruptedException {
        while (true) {
            String message = queue.peek();
            if (message != null) {
                //sendEmail();
            }
            Thread.sleep(100);
        }
    }

    public void sendEmail(String to, String from, String title, String text) {

    }
}
