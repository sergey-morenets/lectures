package capgemini.monitoring;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    @Timed("users.all")
    public List<User> findAll() {
        return List.of(new User());
    }
}
