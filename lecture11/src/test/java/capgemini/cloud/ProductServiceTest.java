package capgemini.cloud;

import capgemini.cloud.client.ProductClient;
import capgemini.cloud.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class ProductServiceTest {

    @Autowired
    ProductService productService;

    @MockBean
    ProductClient productClient;

    @BeforeEach
    void setup() {
        BDDMockito.given(productClient.findById(Mockito.any())).willReturn(new Product());
    }

}