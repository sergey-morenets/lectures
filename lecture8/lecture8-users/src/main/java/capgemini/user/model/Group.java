package capgemini.user.model;

import capgemini.common.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "`GROUPS`")
@NoArgsConstructor
@AllArgsConstructor
public class Group extends BaseEntity {

    private String name;

    @OneToMany
    private List<Student> students;

//    private LocalDateTime createdAt;
//
//    private User createdBy;
//
//    private LocalDateTime lastModifiedAt;
//
//    private User lastModifiedBy;
}
