package capgemini.web.controller;

import capgemini.web.dto.UserDTO;
import capgemini.web.model.User;
import capgemini.web.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
// GET /
public class UserController {

    private final ObjectMapper objectMapper = new ObjectMapper().findAndRegisterModules();

    private final UserService userService;

//    @GetMapping("{id}")
//    public ResponseEntity<UserDTO> findById(@PathVariable int id) {
//        User user = userService.findById(id);
//        if (user == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(new UserDTO(id, user.getUsername(), 45));
//    }

    @GetMapping("{id}")
    public UserDTO findById(@PathVariable int id) {
        User user = userService.findById(id);
        return new UserDTO(id, user.getUsername(), 45);
    }

    @GetMapping
    public List<UserDTO> findAll() {
        return List.of(new UserDTO(1, "john", 30),
                new UserDTO(2, "peter", 40));
    }

    @PostMapping
    public ResponseEntity<Void> register(@Valid @RequestBody UserDTO user) throws URISyntaxException {
        if (userService.findByUsername(user.getUsername())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        System.out.println("Success! " + user.getUsername());
        return ResponseEntity.created(new URI("")).build();
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
