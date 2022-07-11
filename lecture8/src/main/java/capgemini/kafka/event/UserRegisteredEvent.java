package capgemini.kafka.event;

import capgemini.kafka.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserRegisteredEvent implements IntegrationEvent {

    private int userId;

    private String email;

    public UserRegisteredEvent(User user) {
        userId = user.getId();
        email = user.getEmail();
    }
}
