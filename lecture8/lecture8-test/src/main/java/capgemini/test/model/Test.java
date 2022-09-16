package capgemini.test.model;

import capgemini.common.model.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class Test extends BaseEntity {

    @OneToMany
    private List<Question> questions;
}
