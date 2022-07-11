package capgemini.kafka;

import capgemini.kafka.event.IntegrationEvent;
import capgemini.kafka.event.UserDeletedEvent;
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

    private final KafkaTemplate<Integer, IntegrationEvent> kafkaTemplate;

    public void register(User user) {

        kafkaTemplate.send("users", user.getId(), new UserRegisteredEvent(user));

        // user registration
        //queue.add("User registered: " + user.getEmail());
        //emailService.sendEmail(user.getEmail(), "Mail service", "Successful registration", "");

    }

    public void delete(User user) {
        kafkaTemplate.send("users", user.getId(), new UserDeletedEvent(user.getId()));
    }
}
