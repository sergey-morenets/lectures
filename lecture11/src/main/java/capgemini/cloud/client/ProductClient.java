package capgemini.cloud.client;

import capgemini.cloud.config.FeignConfiguration;
import capgemini.cloud.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@FeignClient(url = "http://product:8090/products")
@FeignClient(name = "product", configuration = FeignConfiguration.class)
public interface ProductClient {

    @GetMapping
    List<Product> findAll();

    @GetMapping("{id}")
    Product findById(@PathVariable int id);

    @PostMapping
    void create(@RequestBody Product product);

    @PutMapping("{id}")
    void update(@PathVariable int id, @RequestBody Product product);

    @DeleteMapping
    int delete(@PathVariable int id);
}
