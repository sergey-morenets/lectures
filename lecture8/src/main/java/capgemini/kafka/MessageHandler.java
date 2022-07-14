package capgemini.kafka;

import capgemini.kafka.event.IntegrationEvent;
import capgemini.kafka.event.UserDeletedEvent;
import capgemini.kafka.event.UserRegisteredEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MessageHandler {

    @KafkaListener(topics = "users")
    public void onUserCreated(@Payload IntegrationEvent event) {
        if (event instanceof UserRegisteredEvent registeredEvent) {
            log.info("New user: {}", event);

        } else if (event instanceof UserDeletedEvent deletedEvent) {
            log.info("User deleted: {}", event);
        }
    }
}
