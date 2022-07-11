package capgemini.microservice.student.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Student {
    private int id;

    private String firstName;

    private String lastName;

    private LocalDateTime entryDate;

    private int birthYear;

    private Group group;

    private LocalDateTime createdAt;

    private LocalDateTime lastModifiedAt;

    private boolean enabled;

    private Country country;
}
