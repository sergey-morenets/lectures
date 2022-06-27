package capgemini.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.security.InvalidParameterException;

@ControllerAdvice
@Slf4j
public class PrimaryExceptionHandler {

    @ExceptionHandler
    protected ResponseEntity<?> handleNotFound(InvalidParameterException ex) {
        log.debug("Incorrect request parameters: {}", ex.getMessage());
        return ResponseEntity.notFound().build();
    }
}
