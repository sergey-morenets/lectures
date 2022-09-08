package capgemini.db.persistence;

import capgemini.db.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Commit;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepository;

    @Test
    @Commit
    void findById_productExists_success() {
        Product product = new Product();
        product.setName("PC");
        product.setPrice(1000);

        productRepository.saveAndFlush(product);
        assertTrue(product.getId() > 0);

        //TODO Investigate how to invoke SELECT SQL in this case
        Product product2 = productRepository.findById(product.getId()).orElseThrow();
        assertNotNull(product2);
        assertEquals(product.getName(), product2.getName());

    }

}