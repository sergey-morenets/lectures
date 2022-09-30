package capgemini.test.web;

import capgemini.test.dto.ExamDTO;
import capgemini.test.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("exams")
@RequiredArgsConstructor
public class ExamController {

    private final ExamService examService;

    @GetMapping("{id}")
    public ExamDTO findById(@PathVariable int id) {
        return new ExamDTO(id, 1, examService.getStudentName(1));
    }
}
