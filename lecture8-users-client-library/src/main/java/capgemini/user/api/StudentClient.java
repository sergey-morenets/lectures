package capgemini.user.api;

import capgemini.user.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user", path = "students")
public interface StudentClient {

    @GetMapping("{id}")
    StudentDTO findById(@PathVariable int id);
}
