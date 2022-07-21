package capgemini.cloud.web;

import capgemini.cloud.ProductService;
import capgemini.cloud.model.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.function.Supplier;

@RestController
@RequestMapping //("products")
@RequiredArgsConstructor
@Slf4j
public class ProductController {
    private static final String SERVICE_PRODUCT = "productService";

    private final ProductService productService;

    private final CircuitBreakerFactory factory;

    @Value("${circuit.breaker.enabled}")
    private boolean useCircuitBreaker = true;

    /***
     * Returns all the products (optional) and total amount of products
     * @return
     */
    @GetMapping("products")
    public ResponseEntity<List<Product>> findAll(@RequestParam(value = "includeItems", required = false)
                                                 boolean includeItems) {
        //TODO add response header (total count)
        return ResponseEntity.ok(List.of(new Product()));
    }

    // HTTP method? and maybe other attributes
    // URI ?

    //GET /count
    //GET /total/number
    //GET /products/count
    @GetMapping("count")
    public int getTotalProductCount() {
        return 100;
    }

    @GetMapping("{id}")
    //@Cacheable(cacheNames = "products")
    //@io.github.resilience4j.retry.annotation.Retry(name = "productService", fallbackMethod = "getProductFromCache")
    public Product findById(@PathVariable("id") int productId) {
        return factory.create(SERVICE_PRODUCT).run(() -> productService.findById(productId),
                ex -> getProductFromCache(productId));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Product product) {
        safeExecute(SERVICE_PRODUCT, () -> productService.save(product));
    }

    private <T> T safeExecute(String configName, Supplier<T> supplier) {
        if (useCircuitBreaker) {
            return factory.create(configName).run(supplier);
        }
        return supplier.get();
    }

    private Product getProductFromCache(int productId) {
        return null;
    }
}
