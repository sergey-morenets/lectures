package capgemini.user.web;

import capgemini.user.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping("{id}")
    public Student findById(@PathVariable int id) {
        return new Student();
    }
}
