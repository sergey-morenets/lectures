package capgemini.cloud.repository;

import capgemini.cloud.CloudApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = CloudApplication.class)
@Transactional
class ProductRepositoryTest {
    //ALl those fields are used in all the tests
    //Don't share the state in the tests
//    Product product1;
//
//    Product product2;
//
//    Order order1;

    @BeforeEach
    void setup() {
    }

    @Autowired
    ProductRepository productRepository;

    @Test
    void findByName_() {

    }

}