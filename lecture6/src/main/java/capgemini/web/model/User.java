package capgemini.web.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;

    @Column(unique = true)
    private String username;

    private String password;

    private int age;
}
