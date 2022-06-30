package capgemini.microservice.test.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ExamDTO {
    private int id;

    private int testId;

    private int studentId;

    private LocalDateTime startTime;

    private LocalDateTime endTime;
}
