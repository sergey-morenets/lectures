package capgemini.security.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping
public class HomeController {

    @GetMapping("hello")
    public String hello(Principal principal) {
        //String userName = SecurityContextHolder.getContext().getAuthentication().getName();
        //return userName + ", hello from Capgemini";
        return principal.getName() + ",hello again from Capgemini";
    }
}
