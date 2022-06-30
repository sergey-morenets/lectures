package capgemini.microservice.student.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentRegisteredEvent {

    private int studentId;

//    private String email;
//
//    private String phone;

    private LocalDateTime createdAt;
}
