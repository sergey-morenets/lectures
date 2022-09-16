package capgemini.monolith.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class Exam {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "STUDENT_ID")
    private Student student;

    private int rate;

    @ManyToOne
    @JoinColumn(name = "TEST_ID")
    private Test test;
}
