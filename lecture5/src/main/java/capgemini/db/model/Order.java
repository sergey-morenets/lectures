package capgemini.db.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Table(name = "ORDERS")
@Entity
public class Order {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID", nullable = false)
    private Product product;

    private int amount;

    @PrePersist
    void onPersist() {
        createdAt = LocalDateTime.now();
    }
}
