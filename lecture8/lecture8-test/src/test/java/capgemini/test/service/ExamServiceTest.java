package capgemini.test.service;

import capgemini.user.api.StudentClient;
import capgemini.user.dto.StudentDTO;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class ExamServiceTest {

    @Autowired
    ExamService examService;

    @MockBean
    StudentClient studentClient;

    @Test
    void getStudentName() {
        BDDMockito.given(studentClient.findById(1)).willReturn(new StudentDTO(1, "Peter"));
    }
}