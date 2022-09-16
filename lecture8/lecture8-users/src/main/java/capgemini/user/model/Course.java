package capgemini.user.model;

import capgemini.common.model.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Table
@Entity
public class Course extends BaseEntity {

    private String name;

    @ManyToOne
    @JoinColumn(name = "TEACHER_ID")
    private Teacher teacher;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    @OneToMany
    private List<Group> groups;
}
