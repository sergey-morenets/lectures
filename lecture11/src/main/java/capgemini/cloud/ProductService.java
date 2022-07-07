package capgemini.cloud;

import capgemini.cloud.model.Product;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ProductService {
    private final Random random = new Random();

    public Product findById(int id) {
        int idx = random.nextInt(3);
        if (idx % 3 == 0) {
            throw new RuntimeException("Error!");
        }
        return new Product();
    }
}
