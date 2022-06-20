package capgemini.config;

import capgemini.data.model.Product;
import capgemini.persistence.ProductRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DataInitializer {

    private final ProductRepository productRepository;

    public void initialize() {
        Product product = new Product();
        product.setName("PC");
        productRepository.save(product);
    }
}
