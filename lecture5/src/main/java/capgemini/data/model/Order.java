package capgemini.data.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "ORDERS")
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    private int id;

    @Column(name = "AMOUNT", nullable = false)
    private int amount;

    @ManyToOne(optional = false)
    @JoinColumn(name = "PRODUCT_ID", nullable = false)
    private Product product;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime lastModifiedAt;

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
