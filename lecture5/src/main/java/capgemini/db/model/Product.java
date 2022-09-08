package capgemini.db.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "PRODUCTS")
public class Product {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "PRODUCT_NAME", length = 48, unique = true, nullable = false)
    private String name;

    private double price;

    @OneToMany(mappedBy = "product")
    private List<Order> orders;
}
