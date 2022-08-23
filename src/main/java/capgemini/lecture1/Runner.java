package capgemini.lecture1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@FunctionalInterface
public interface Runner {

    void run();

    default void run(long ms) {
        run();
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

        List<User> users = new ArrayList<>();
        users.add(new User(1, "John"));
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
