package capgemini.microservice.student.dto;

import javax.validation.constraints.NotEmpty;

public record GroupDTO(int id, @NotEmpty String name) {
}
