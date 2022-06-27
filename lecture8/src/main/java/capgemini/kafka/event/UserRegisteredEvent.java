package capgemini.kafka.event;

import capgemini.kafka.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserRegisteredEvent {

    private int userId;

    private LocalDateTime registeredAt;

    private String email;

    public UserRegisteredEvent(User user) {
        userId = user.getId();
        email = user.getEmail();
        registeredAt = LocalDateTime.now();
    }
}
