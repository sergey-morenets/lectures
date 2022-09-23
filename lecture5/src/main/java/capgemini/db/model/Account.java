package capgemini.db.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table
@Entity
public class Account {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;
}
