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
@Table
public class Group {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private LocalDateTime createdAt;

    private User createdBy;

    private LocalDateTime lastModifiedAt;

    private User lastModifiedBy;
}
