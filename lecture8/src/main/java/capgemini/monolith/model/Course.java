package capgemini.monolith.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Table
@Entity
public class Course {

    private int id;

    private String name;

    private LocalDateTime startDate;

    private LocalDateTime endDate;
}
