package capgemini.kafka;

import capgemini.kafka.event.UserRegisteredEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MessageHandler {

    @KafkaListener(topics = "users")
    public void onMessageHandle(@Payload UserRegisteredEvent event) {
        log.info("New event: {}", event);
    }
}
