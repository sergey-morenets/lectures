package capgemini.cloud.web;

import capgemini.cloud.ProductService;
import capgemini.cloud.model.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping //("products")
@RequiredArgsConstructor
@Slf4j
public class ProductController {

    private final ProductService productService;

    private final CircuitBreakerFactory factory;

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
        return factory.create("productService").run(() -> productService.findById(productId),
                ex -> getProductFromCache(productId));
//        RetryConfig config = RetryConfig.custom()
//                .maxAttempts(2)
//                .waitDuration(Duration.ofMillis(1000))
//                .retryExceptions(IOException.class, TimeoutException.class)
//                .ignoreExceptions(NullPointerException.class)
//                .failAfterMaxAttempts(true)
//                .build();
//        Retry retry = Retry.of("productService", config);
//
//        Supplier<Product> supplier = () -> productService.findById(productId);
//
//        Supplier<Product> decoratedSupplier = Decorators.ofSupplier(supplier)
//                .withRetry(retry)
//                .decorate();
//        return Try.ofSupplier(decoratedSupplier)
//                .recover(ex -> getProductFromCache(productId)).get();
//        int attempts = 0;
//
//        Exception lastException = null;
//        while (attempts <= 3) {
//            try {
//                return productService.findById(productId);
//            } catch (Exception ex) {
//                attempts++;
//                lastException = ex;
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                }
//            }
//        }
//        throw new RuntimeException(lastException);
    }

    private Product getProductFromCache(int productId) {
        return null;
    }
}
