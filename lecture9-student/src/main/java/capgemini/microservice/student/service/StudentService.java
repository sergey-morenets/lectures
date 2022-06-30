package capgemini.microservice.student.service;

import capgemini.microservice.student.event.StudentRegisteredEvent;
import capgemini.microservice.student.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;

@RequiredArgsConstructor
public class StudentService {

    private final KafkaTemplate<Integer, StudentRegisteredEvent> kafkaTemplate;

    public void create(Student student) {
        kafkaTemplate.send("students", student.getId(),
                new StudentRegisteredEvent(student.getId(), student.getCreatedAt()));
    }
}
