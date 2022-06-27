package capgemini.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

@Service
@RequiredArgsConstructor
public class UserService {

//    private final EmailService emailService;

    private final Queue<String> queue = new LinkedBlockingQueue<>();

    public void register(User user) {

        // user registration
        queue.add("User registered: " + user.getEmail());
        //emailService.sendEmail(user.getEmail(), "Mail service", "Successful registration", "");

    }
}
