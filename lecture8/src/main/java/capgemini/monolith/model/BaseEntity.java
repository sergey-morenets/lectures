package capgemini.monolith.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
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

    @PrePersist
    void onPersist() {
        createdAt = LocalDateTime.now();
    }

    @PreUpdate
    void onUpdate() {
        lastModifiedAt = LocalDateTime.now();
    }
}
