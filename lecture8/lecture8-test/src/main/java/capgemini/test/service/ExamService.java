package capgemini.test.service;

import capgemini.user.dto.StudentDTO;
import io.github.resilience4j.decorators.Decorators;
import io.github.resilience4j.retry.Retry;
import io.vavr.control.Try;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.function.Supplier;

@Service
@RequiredArgsConstructor
@Slf4j
public class ExamService {

    private final RestTemplate restTemplate;

    private String getStudentName(int studentId) throws Exception {
//        int maxAttempts = 3;
//        while (maxAttempts > 0) {
//            try {
//                StudentDTO student = restTemplate.getForObject("http://user/students/" + studentId,
//                        StudentDTO.class);
//                return student.getName();
//            } catch (Exception ex) {
//                maxAttempts--;
//                log.error(ex.getMessage(), ex);
//                Thread.sleep(1000);
//            }
//        }
//        return "N/A";

        Retry retry = Retry.ofDefaults("default");
        Supplier<String> supplier = Decorators.ofSupplier(
                        () -> restTemplate.getForObject("http://user/students/" + studentId,
                                StudentDTO.class).getName())
                .withRetry(retry)
                .decorate();
        // Or take student name from the cache
        return Try.ofSupplier(supplier)
                .recover(ex -> "N/A").get();

//        String name = retry.executeCallable(() -> restTemplate.getForObject("http://user/students/" + studentId,
//                StudentDTO.class).getName());
//        return name;

    }
}
