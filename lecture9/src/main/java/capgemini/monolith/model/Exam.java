package capgemini.monolith.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Exam {

    private int id;

    private Test test;

    private Student student;

    private LocalDateTime startTime;

    private LocalDateTime endTime;
}
