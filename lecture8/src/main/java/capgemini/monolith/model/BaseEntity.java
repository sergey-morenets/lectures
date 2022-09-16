package capgemini.monolith.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue
    private int id;

    private LocalDateTime createdAt;

    private User createdBy;

    private LocalDateTime lastModifiedAt;

    private User lastModifiedBy;
}
