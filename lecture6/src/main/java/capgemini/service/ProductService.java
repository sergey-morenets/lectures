package capgemini.service;

import capgemini.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    public List<Product> search(String name, Double price) {
        return List.of(new Product(1, "Book", 200d));
    }
}
