package capgemini.spring.boot.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class ProductServiceTest {

    @Autowired
    ProductService productService;

    @Test
    void count() {
        assertEquals(0, productService.count());
    }
}