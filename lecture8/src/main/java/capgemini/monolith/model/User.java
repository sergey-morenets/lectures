package capgemini.monolith.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "`USERS`")
public class User {

    @Id
    @GeneratedValue
    private int id;

    private String userName;

    private String password;

    private LocalDateTime createdAt;

    private LocalDateTime lastModifiedAt;
}
