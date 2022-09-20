package capgemini.test.service;

import capgemini.user.dto.StudentDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExamService {

    private final RestTemplate restTemplate = new RestTemplate();

    private String getStudentName(int studentId) {
        //TODO how to use response class from other microservices ?
        StudentDTO student = restTemplate.getForObject("http://localhost:8080/students/" + studentId,
                StudentDTO.class);
        return student.getName();
    }

}
