package capgemini.test.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExamService {

    private final RestTemplate restTemplate = new RestTemplate();

    private String getStudentName(int studentId) {
        //TODO how to use response class from other microservices ?
        StudentFake student = restTemplate.getForObject("http://localhost:8080/students/" + studentId, StudentFake.class);
        return student.name;
    }


    class StudentFake {

        private String name;

    }
}
