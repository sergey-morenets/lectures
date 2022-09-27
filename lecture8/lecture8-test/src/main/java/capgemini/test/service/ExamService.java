package capgemini.test.service;

import capgemini.user.dto.StudentDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class ExamService {

    private final RestTemplate restTemplate;

    private String getStudentName(int studentId) {
        //TODO how to use response class from other microservices ?
        StudentDTO student = restTemplate.getForObject("http://user/students/" + studentId,
                StudentDTO.class);
        return student.getName();
    }

}
