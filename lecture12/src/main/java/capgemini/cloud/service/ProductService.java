package capgemini.cloud.service;

import capgemini.cloud.model.Product;
import capgemini.cloud.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product findByName(String name) {
        return productRepository.findByName(name).orElseThrow
                (() -> new RuntimeException("No product found"));
    }
}
