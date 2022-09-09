package capgemini.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTOV2 {
    private int id;

    private String login;

    private String role;

    private int age;
}
