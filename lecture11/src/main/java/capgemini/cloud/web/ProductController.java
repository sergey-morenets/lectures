package capgemini.cloud.web;

import capgemini.cloud.ProductService;
import capgemini.cloud.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<Product> findAll() {
        return List.of(new Product());
    }

    @GetMapping("{id}")
    //@Cacheable(cacheNames = "products")
    public Product findById(@PathVariable("id") int productId) {
        int attempts = 0;

        Exception lastException = null;
        while (attempts <= 3) {
            try {
                return productService.findById(productId);
            } catch (Exception ex) {
                attempts++;
                lastException = ex;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
        }
        throw new RuntimeException(lastException);
    }
}
