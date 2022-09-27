package capgemini.test.service;

import capgemini.user.dto.StudentDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
@Slf4j
public class ExamService {

    private final RestTemplate restTemplate;

    private String getStudentName(int studentId) throws InterruptedException {
        int maxAttempts = 3;
        while (maxAttempts > 0) {
            try {
                StudentDTO student = restTemplate.getForObject("http://user/students/" + studentId,
                        StudentDTO.class);
                return student.getName();
            } catch (Exception ex) {
                maxAttempts--;
                log.error(ex.getMessage(), ex);
                Thread.sleep(1000);
            }
        }
        return "N/A";
    }

}
