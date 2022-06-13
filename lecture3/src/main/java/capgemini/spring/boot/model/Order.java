package capgemini.spring.boot.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

class DiscountRules {
    private static final int maxDiscountAmount = Order.MAX_DISCOUNT_EUROS;
}

@Getter
@Setter
/***
 *
 */
public class Order {

    private Integer id;

    private String name;

    public final static int MAX_DISCOUNT_EUROS = 30;

    //created, completed, payed, error
    private OrderStatus status;

    private List<Attribute> attributes;

    private LocalDateTime createdAt;

    private int createdBy;

    private LocalDateTime lastModifiedAt;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public static void main(String[] args) {
        Order order = new Order();
        order.setName("ID1");
        order.setAttributes(new LinkedList<>());
        System.out.println(order.getId() == 0);

        order.setStatus(OrderStatus.CREATED);

        ////

        Order order2 = new Order();
        order2.setStatus(OrderStatus.COMPLETED);

        ///
        Order order3 = new Order();
        order2.setStatus(OrderStatus.ERROR);
    }
}

@Getter
@Setter
class Attribute {
    private int id;

    private String name;
}

enum OrderStatus {
    CREATED, COMPLETED, ERROR, PAYED
}