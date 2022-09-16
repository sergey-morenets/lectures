package capgemini.monolith.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class Test {

    @Id
    @GeneratedValue
    private int id;

    @OneToMany
    private List<Question> questions;
}
