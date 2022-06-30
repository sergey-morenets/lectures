package capgemini.microservice.notification.config;

import capgemini.microservice.notification.service.EmailService;
import capgemini.microservice.student.event.StudentRegisteredEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NotificationListener {

    private final EmailService emailService;

    @KafkaListener(topics = "students", groupId = "notification")
    public void listen(@Payload StudentRegisteredEvent event) {
        //emailService.send(t);

    }
}
