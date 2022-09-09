package capgemini.web.controller;

import capgemini.web.dto.UserDTO;
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
    public List<UserDTO> findAll() {
        return List.of(new UserDTO(1, "john", 30),
                new UserDTO(2, "peter", 40));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@RequestBody UserDTO user) {
        System.out.println("Success! " + user.getUsername());
    }

    @PutMapping("{id}")
    public void update(@PathVariable int id, @RequestBody UserDTO user) {
        System.out.println("Updated user with id " + id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        System.out.println("Deleted user with id " + id);
    }

//    @PostMapping("user")
//    public String register(@Valid User user, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            return "registration";
//        }
//        userService.signUpUser(user);
//        return "redirect:/";
//    }

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
