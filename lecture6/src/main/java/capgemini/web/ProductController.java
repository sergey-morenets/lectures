package capgemini.web;

import capgemini.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("")
    public String helloWorld() {
        return "Hello, World";
    }

    @GetMapping("current")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public LocalDateTime currentDate() {
        return LocalDateTime.now();
    }

    @GetMapping("products")
    public List<Product> findAll() {
        return List.of(new Product());
    }

    @GetMapping("products/{id}") //GET products/1
    public Product findOne(@PathVariable int id) {
        return new Product();
    }

    @PostMapping(value = "products")
    public void create(@RequestBody Product product) {
        // Save product
        System.out.println(product);
    }

    @PutMapping(value = "products/{id}")
    public void update(@PathVariable int id, @RequestBody Product product) {
        // Save product
        System.out.println(product);
    }

    @DeleteMapping(value = "products/{id}")
    public void delete(@PathVariable int id) {
        // Delete product
    }

//    @RequestMapping("products")
//    public String findAll() throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        return objectMapper.writeValueAsString(List.of(new Product()));
//    }
}
