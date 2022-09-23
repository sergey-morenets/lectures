package capgemini.db.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table
public class Rating {

    @Id
    @GeneratedValue
    private int id;

    private int rating;

    private String bookName;
}
