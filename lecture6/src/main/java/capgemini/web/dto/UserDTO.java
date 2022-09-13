package capgemini.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    @PositiveOrZero
    private int id;

    @NotNull
    @Size(min = 4, max = 32)
    private String username;

    @Min(18)
    @Max(120)
    private int age;
}
