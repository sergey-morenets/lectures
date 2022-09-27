package capgemini.user.model;

import capgemini.common.model.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

@Getter
@Setter
@Entity
@Table
public class Student extends BaseEntity {

    private String name;

    @Transient
    private List<Integer> exams;

}
