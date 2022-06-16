package capgemini.data.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "PRODUCTS")
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "PRODUCT_ID")
    private int id;

    @Column(name = "NAME", unique = true, nullable = false, length = 32)
    private String name;

    @Column(name = "PRICE", nullable = false)
    private double price;
}
