package capgemini.web.service;

import capgemini.web.model.User;
import capgemini.web.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User findById(int id) {
        //return userRepository.findById(id).orElseThrow(() -> new NotFoundException("User with id " + id + " not found"));
        return userRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                "User with id " + id + " not found"));
    }


    public boolean findByUsername(String username) {
        return true;
    }
}
