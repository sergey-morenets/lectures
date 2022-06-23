package capgemini.service;

import capgemini.data.model.Product;
import capgemini.persistence.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
public class ProductService {

    private final ProductRepository productRepository;

    public void save(Product product) {
        productRepository.save(product);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    //Git issue
    //Add run method and counter field to the Starter class, add start method and items and elements fields to the SuperStarter class
    //low-level description
    //run -> execute
    //high level: Extract common fields into base entity class
    //low-level: Create BaseEntity abstract class and move createdAt, lastModifiedAt, id from Order, Product, Category, User classes into BaseEntity
}
