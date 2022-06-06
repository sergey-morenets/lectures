package capgemini.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringJUnitConfig(classes = CapgeminiConfiguration.class)
class ProductAPITest {

    @Autowired
    ProductAPI productAPI;

    @Test
    void findProduct_validIdentifier_productReturned() {
        Product product = productAPI.findProduct(1);
        assertNotNull(product);
    }
}