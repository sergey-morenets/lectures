package capgemini.microservice.student.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Teacher {

    private int id;

    private String name;

    private Country country;
}
