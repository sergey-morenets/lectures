package capgemini.data.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "ORDERS")
public class Order extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    private int id;

    @Column(name = "AMOUNT", nullable = false)
    private int amount;

    @ManyToOne(optional = false)
    @JoinColumn(name = "PRODUCT_ID", nullable = false)
    private Product product;

    //    @PrePersist
//    void prePersist() {
//        createdAt = LocalDateTime.now();
//    }
//
//    @PreUpdate
//    void preUpdate() {
//        lastModifiedAt = LocalDateTime.now();
//    }
//
}
