package capgemini.cloud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ORDERS")
@Entity
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue
    private int id;
}
