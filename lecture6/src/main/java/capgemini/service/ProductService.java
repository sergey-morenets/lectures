package capgemini.service;

import capgemini.exception.IllegalParameterException;
import capgemini.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    public List<Product> search(String name, Double price) {
        return List.of(new Product(1, "Book", 200d));
    }

    public Product findById(int id) throws IllegalParameterException {
        if (id <= 0) {
            throw new IllegalParameterException("Identifier " + id + " should be greater than zero");
        }
        return new Product(2, "Training course", 1000d);
    }
}
