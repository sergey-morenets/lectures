package capgemini.service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailService {

    //1. Which HTTP method to use
    //2. Which URI to use here
    @PostMapping("email")
    public void sendEmail(String from, String to, String title, String text) {
        //Send email
    }
}
