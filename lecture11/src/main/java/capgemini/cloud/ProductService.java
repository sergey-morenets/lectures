package capgemini.cloud;

import capgemini.cloud.client.ProductClient;
import capgemini.cloud.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final Random random = new Random();

    private final ProductClient productClient;

    public Product findById(int id) {
        int idx = random.nextInt(3);
        if (idx % 3 == 0) {
            throw new RuntimeException("Error!");
        }
        return new Product();
    }
}
