package capgemini.microservice.test.web;

import capgemini.microservice.test.dto.ExamDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("exams")
public class ExamController {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void create(@RequestBody @Valid ExamDTO examDTO) {

    }
}
