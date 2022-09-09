package capgemini.web.controller;

import capgemini.web.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
// GET /
public class UserController {

    private final ObjectMapper objectMapper = new ObjectMapper().findAndRegisterModules();

    @GetMapping
    public List<User> findAll() {
        return List.of(new User(1, "john", "john", 30),
                new User(2, "peter", "peter", 40));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@RequestBody User user) {
        System.out.println("Success! " + user.getUsername());
    }

    @PutMapping("{id}")
    public void update(@PathVariable int id, @RequestBody User user) {
        System.out.println("Updated user with id " + id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        System.out.println("Deleted user with id " + id);
    }

//    @GetMapping
//    public String findAll() throws JsonProcessingException {
//        return objectMapper.writeValueAsString(List.of(new User(1, "john", "john", 30),
//                new User(2, "peter", "peter", 40)));
//    }

//    @GetMapping("hello")
//    public String hello() {
//        return "Hello, Capgemini!";
//    }
}
