package capgemini.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class ProductController {

    @RequestMapping("")
    public String helloWorld() {
        return "Hello, World";
    }

    @RequestMapping("current")
    public String currentDate() {
        return LocalDateTime.now().toString();
    }
}
