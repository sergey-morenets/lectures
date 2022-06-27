package capgemini.kafka;

import capgemini.kafka.event.UserRegisteredEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

@Service
@RequiredArgsConstructor
public class UserService {

//    private final EmailService emailService;

    private final Queue<String> queue = new LinkedBlockingQueue<>();

    private final KafkaTemplate<Integer, UserRegisteredEvent> kafkaTemplate;

    public void register(User user) {

        kafkaTemplate.send("users", user.getId(), new UserRegisteredEvent(user));

        // user registration
        //queue.add("User registered: " + user.getEmail());
        //emailService.sendEmail(user.getEmail(), "Mail service", "Successful registration", "");

    }
}
