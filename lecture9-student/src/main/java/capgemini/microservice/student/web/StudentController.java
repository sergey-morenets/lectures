package capgemini.microservice.student.web;

import capgemini.microservice.student.dto.StudentDTO;
import capgemini.microservice.student.service.EmailService;
import capgemini.microservice.student.service.MobileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("students")
@RequiredArgsConstructor
public class StudentController {

    private final EmailService emailService;

    private final MobileService mobileService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@Valid @RequestBody StudentDTO studentDTO) {
// student registration

        emailService.send(studentDTO.getEmail(), "info@university", "You're registered", "Congratulations");

        mobileService.sendSms(studentDTO.getPhone(), "Congratulations");
    }
}
