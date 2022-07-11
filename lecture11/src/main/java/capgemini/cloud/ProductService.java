package capgemini.cloud;

import capgemini.cloud.client.ProductClient;
import capgemini.cloud.model.Product;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final Random random = new Random();

    private final ProductClient productClient;

    public Product findById(int id) {
        try {
            return productClient.findById(1);
        } catch (FeignException ex) {
            //status code 4xx
            //status code 5xx
            throw ex;
        }
//        int idx = random.nextInt(3);
//        if (idx % 3 == 0) {
//            throw new RuntimeException("Error!");
//        }
//        return new Product();
    }
}
