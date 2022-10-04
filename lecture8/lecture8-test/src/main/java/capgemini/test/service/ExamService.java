package capgemini.test.service;

import capgemini.user.api.StudentClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ExamService {

    //private final RestTemplate restTemplate;

    private final StudentClient studentClient;

    private final CircuitBreakerFactory circuitBreakerFactory;

    public String getStudentName(int studentId) {
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

//        CircuitBreaker circuitBreaker = CircuitBreaker.ofDefaults("default");
//
//        Retry retry = Retry.ofDefaults("default");
//        Supplier<String> supplier = Decorators.ofSupplier(
//                        () -> studentClient.findById(studentId).getName())
//                .withRetry(retry)
//                .withCircuitBreaker(circuitBreaker)
//                .decorate();
//        return Try.ofSupplier(supplier)
//                .recover(ex -> "N/A").get();
        return circuitBreakerFactory.create("default").run(
                () -> studentClient.findById(studentId).getName(),
                ex -> {
                    log.error(ex.getMessage(), ex);
                    return "N/A";
                });
    }
}
