package capgemini.service;

import capgemini.SpringDataApplication;
import capgemini.data.model.Order;
import capgemini.data.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//@DataJpaTest
@SpringBootTest(classes = SpringDataApplication.class)
//@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@Transactional
class ProductServiceTest {

    @Autowired
    ProductService productService;

    @Test
    void save_productWithoutOrders_success() {
        Product product = new Product();
        product.setName("Training course");
        product.setPrice(100d);

        productService.save(product);
        assertTrue(product.getId() > 0);

        List<Product> products = productService.findAll();
        assertEquals(1, products.size());
        assertEquals(product.getId(), products.get(0).getId());
    }

    @Test
    void save_productWithoutPrice_error() {
        Product product = new Product();
        product.setName("Training course");

        assertThrows(DataIntegrityViolationException.class, () -> productService.save(product));
    }

    //TODO add test to verify uniqueness of name

    @Test
    void save_productWithOrders_success() {
        Product product = new Product();
        product.setName("Training course");
        product.setPrice(100d);

        Order order = new Order();
        order.setAmount(4);
        product.addOrder(order);

        productService.save(product);
        assertTrue(product.getId() > 0);

        List<Product> products = productService.findAll();
        assertEquals(1, products.size());
        assertEquals(product.getId(), products.get(0).getId());
    }
}