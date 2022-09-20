package capgemini.web.service;

import capgemini.web.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User findById(int id) {
        return null;
    }


    public boolean findByUsername(String username) {
        return true;
    }
}
