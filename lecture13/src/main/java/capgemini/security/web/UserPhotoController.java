package capgemini.security.web;

import capgemini.security.model.UserPhoto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserPhotoController {

    //@GetMapping("userPhotos/{id}")
    @GetMapping("{userId}/photos")
    public List<UserPhoto> findAllPhotosOfUser(@PathVariable("userId") int userId) {
        //TODO add implementation
        return null;
    }
}
