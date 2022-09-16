package capgemini.monolith.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
public class Exam extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "STUDENT_ID")
    private Student student;

    private int rate;

    @ManyToOne
    @JoinColumn(name = "TEST_ID")
    private Test test;
}
