package capgemini.monolith.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Table
public class Teacher extends BaseEntity {

    private String name;

    @OneToMany
    private List<Course> courses;
}
