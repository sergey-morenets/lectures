package capgemini.cloud.web;

import capgemini.cloud.model.Product;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @GetMapping
    public List<Product> findAll() {
        return List.of(new Product());
    }

    @GetMapping("{id}")
    @Cacheable(cacheNames = "products")
    public Product findById(@PathVariable("id") int productId) {
        return new Product();
    }
}
