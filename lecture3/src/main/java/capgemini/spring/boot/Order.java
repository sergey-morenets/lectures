package capgemini.spring.boot;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {

    private int id;

    private String name;
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
        order.setId(1);
        order.setName("ID1");
    }
}
