package capgemini.db.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Table
@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    @OneToMany(mappedBy = "user")
    //@JoinColumn(name = "USER_ID")
    private List<Account> accounts;
}
