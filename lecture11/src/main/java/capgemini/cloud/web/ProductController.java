package capgemini.cloud.web;

import capgemini.cloud.ProductService;
import capgemini.cloud.model.Product;
import io.github.resilience4j.decorators.Decorators;
import io.github.resilience4j.retry.Retry;
import io.github.resilience4j.retry.RetryConfig;
import io.vavr.control.Try;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;

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
        RetryConfig config = RetryConfig.custom()
                .maxAttempts(2)
                .waitDuration(Duration.ofMillis(1000))
                .retryExceptions(IOException.class, TimeoutException.class)
                .ignoreExceptions(NullPointerException.class)
                .failAfterMaxAttempts(true)
                .build();
        Retry retry = Retry.of("productService", config);

        Supplier<Product> supplier = () -> productService.findById(productId);

        Supplier<Product> decoratedSupplier = Decorators.ofSupplier(supplier)
                .withRetry(retry)
                .decorate();
        return Try.ofSupplier(decoratedSupplier)
                .recover(ex -> getProductFromCache(productId)).get();
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
