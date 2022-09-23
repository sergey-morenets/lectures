package capgemini.kafka.config;

import capgemini.kafka.event.OrderCreatedEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;

@Configuration
@EnableKafka
public class KafkaConfig {

    @KafkaListener(topics = "orders")
    void handleOrderCreatedEvent(@Payload OrderCreatedEvent event) {
        //Handle this event
    }
}
