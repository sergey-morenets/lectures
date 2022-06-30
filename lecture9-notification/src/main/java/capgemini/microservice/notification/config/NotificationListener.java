package capgemini.microservice.notification.config;

import capgemini.microservice.notification.service.EmailService;
import capgemini.microservice.student.dto.StudentDTO;
import capgemini.microservice.student.event.StudentRegisteredEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class NotificationListener {

    private final EmailService emailService;

    private final RestTemplate restTemplate;

    @KafkaListener(topics = "students", groupId = "notification")
    public void listen(@Payload StudentRegisteredEvent event) {
        ResponseEntity<StudentDTO> response = restTemplate.getForEntity("http://localhost:9000/students/" +
                event.getStudentId(), StudentDTO.class);
        if (response.getStatusCode() == HttpStatus.OK) {
            StudentDTO studentDTO = response.getBody();
            emailService.send(studentDTO.getEmail(), "info@university", "You're registered!", "Congratulations");
        }
        //emailService.send(t);

    }
}
