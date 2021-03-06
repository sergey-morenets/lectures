package capgemini.data.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "PRODUCTS", indexes = {
        @Index(name = "indProducts_name_price", columnList = "name,price")})
public class Product extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "PRODUCT_ID")
    private int id;

    @Column(name = "NAME", unique = true, nullable = false, length = 32)
    private String name;

    @Column(name = "PRICE", nullable = false)
    private Double price;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<BaseEntity> orders;

    public void addOrder(Order order) {
        if (orders == null) {
            orders = new ArrayList<>();
        }
        orders.add(order);
        order.setProduct(this);
    }
}
