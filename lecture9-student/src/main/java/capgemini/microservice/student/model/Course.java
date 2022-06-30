package capgemini.microservice.student.model;

import lombok.Getter;
import lombok.Setter;

import java.time.Duration;

@Getter
@Setter
public class Course {

    private int id;

    private String name;

    private Duration duration;
}
