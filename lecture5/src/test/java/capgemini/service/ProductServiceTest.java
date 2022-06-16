package capgemini.service;

import capgemini.SpringDataApplication;
import capgemini.data.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//@DataJpaTest
@SpringBootTest(classes = SpringDataApplication.class)
class ProductServiceTest {

    @Autowired
    ProductService productService;

    @Test
    void save_productWithoutOrders_success() {
        Product product = new Product();
        product.setName("Training course");
        product.setPrice(100);

        productService.save(product);
        assertTrue(product.getId() > 0);

        List<Product> products = productService.findAll();
        assertEquals(1, products.size());
        assertEquals(product.getId(), products.get(0).getId());

    }

    @Test
    void findAll() {
    }
}