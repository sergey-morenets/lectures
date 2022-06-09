package capgemini.spring.boot.model;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
/***
 *
 */
public class Order {

    private Integer id;

    private String name;

    private List<Attribute> attributes;
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
    }
}

@Getter
@Setter
class Attribute {
    private int id;

    private String name;
}
