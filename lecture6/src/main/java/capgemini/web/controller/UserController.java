package capgemini.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
// GET /
public class UserController {

    @GetMapping("hello")
    public String hello() {
        return "Hello, Capgemini!";
    }
}
