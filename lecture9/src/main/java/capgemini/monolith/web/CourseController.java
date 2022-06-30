package capgemini.monolith.web;

import capgemini.monolith.dto.CourseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("courses")
public class CourseController {

    @GetMapping
    public List<CourseDTO> findAll() {
        return List.of(new CourseDTO(1, "Test", 10));
    }

    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody CourseDTO courseDTO) {

    }


}
