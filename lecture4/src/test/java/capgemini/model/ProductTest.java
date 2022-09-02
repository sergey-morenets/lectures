package capgemini.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

    Product product;

    @BeforeEach
    void setup() {
        product = new Product();
    }

    @Test
    @Disabled
    void getId_idIsPositive_returnsId() {
        product.setId(1);
        assertEquals(1, product.getId());
    }
}