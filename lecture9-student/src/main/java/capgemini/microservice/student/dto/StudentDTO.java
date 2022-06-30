package capgemini.microservice.student.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class StudentDTO {

    private int id;

    private String firstName;

    private String lastName;

    private String email;

    private LocalDateTime entryDate;

    private String phone;

    private int birthYear;

    private int groupId;
}
