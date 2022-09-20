package capgemini.user.web;

import capgemini.user.dto.StudentDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping("{id}")
    public StudentDTO findById(@PathVariable int id) {
        return new StudentDTO();
    }
}
