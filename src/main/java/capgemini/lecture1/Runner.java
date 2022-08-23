package capgemini.lecture1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@FunctionalInterface
public interface Runner {

    void run();

    default void run(long ms) {
        internalRun();
    }

    private void internalRun() {

    }

    static void run(String msg) {

    }

    public static void main(String[] args) {
//        Runner runner = new Runner() {
//            @Override
//            public void run() {
//
//            }
//        };
        Runner runner = () -> System.out.println("OK");

//        List<User> users = new ArrayList<>();
//        users.add(new User(1, "John"));
        var users = List.of(new User(2, "Peter"), new User(3, "Kate"));

        var newList = new ArrayList<User>();
        User o = newList.get(0);

        var text = (String) null;
//        List<User> existingUsers = new ArrayList<>();
//        for (User user : users) {
//            if (user.getId() > 0) {
//                existingUsers.add(user);
//            }
//        }
        List<User> existingUsers = users.stream().filter(user -> user.getId() > 0).toList();

        Date date = new Date();

        LocalDate localDate = LocalDate.now();
        LocalDate tomorrow = localDate.plusDays(1);
        Duration duration = Duration.between(localDate, tomorrow);
        // localDate ?
        Optional<String> optional = Optional.ofNullable("1");

        Product product = new Product();
        String name = product.getName().orElse("N/A");
        String name2 = product.getName().orElseThrow(() -> new RuntimeException("Product name is missing"));

        Object user = new User(4, "Rebekka");

        if (user instanceof User user1) {
//            User user1 = (User) user;
            int id = user1.getId();
        }

//        int amount = 1;
//        String description = "";
//        switch (amount) {
//            case 1: description = "1"; break;
//            case 2: description = "2";break;
//            default: description = "many";
//        }
        int amount = 1;
        String description = switch (amount) {
            case 1 -> "1";
            case 2 -> "2";
            case 3 -> {
                System.out.println("This is 3");
                yield "3";
            }
            default -> "many";
        };
        System.out.println(description);

        Order order = new Order(1, "ABC", 2);
        //String orderRef = order.getOrderRef();
        String orderRef = order.orderRef();
    }
}

record Order(int productId, String orderRef, int amount) {
}
//private final fields
//getters
//all-arg constructor
//tostring/equals/hashCode

//class Order {
//    public Order(int productId, String orderRef, int amount) {
//        this.productId = productId;
//        this.orderRef = orderRef;
//        this.amount = amount;
//    }
//
//    private final int productId;
//
//    private final String orderRef;
//
//    private final int amount;
//
//    public int getProductId() {
//        return productId;
//    }
//
//    public String getOrderRef() {
//        return orderRef;
//    }
//
//    public int getAmount() {
//        return amount;
//    }
//
//    @Override
//    public String toString() {
//        return "Order{" +
//                "productId=" + productId +
//                ", orderRef='" + orderRef + '\'' +
//                ", amount=" + amount +
//                '}';
//    }
//}

class Product {

//    private String description = "This is description " +
//            "of the class product that should be used " +
//            "to store details of the product entity";

    private String description = """
            This is description
            of the class product that should be used
            to store details of the product entity""";

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
}

@Getter
@Setter
@AllArgsConstructor
class User {
    private int id;

    private String name;

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
}
