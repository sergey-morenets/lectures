package capgemini.cloud.persistence;

import capgemini.cloud.model.Product;
import capgemini.cloud.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DatabaseCreator {

    private final ProductRepository productRepository;

    public void run() {
        //Read-only state
        createAdministrator();
        createProducts();
    }

    private void createAdministrator() {
    }

    private void createProducts() {
        Product product = new Product();
        product.setName("Car");
        product.setPrice(1000d);
        productRepository.save(product);
    }
}
