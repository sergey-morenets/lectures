package capgemini.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {

    @Autowired
    private Environment env;

    @GetMapping("hello")
    public String hello() {
        return env.getRequiredProperty("title");
    }
}
