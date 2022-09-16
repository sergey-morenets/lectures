package capgemini.monolith.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "`GROUPS`")
@NoArgsConstructor
@AllArgsConstructor
public class Group {

    @Id
    @GeneratedValue
    private int id;

    private String name;

//    private LocalDateTime createdAt;
//
//    private User createdBy;
//
//    private LocalDateTime lastModifiedAt;
//
//    private User lastModifiedBy;
}
