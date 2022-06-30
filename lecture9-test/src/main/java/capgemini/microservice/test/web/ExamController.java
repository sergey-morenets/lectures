package capgemini.microservice.test.web;

import capgemini.microservice.test.dto.ExamDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("exams")
public class ExamController {

    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody @Valid ExamDTO examDTO) {

    }
}
