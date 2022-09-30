package capgemini.cloud.service;

import capgemini.cloud.model.Product;
import capgemini.cloud.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product findById(int id) {
        return productRepository.findById(id).orElseThrow
                (() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No product found"));
    }

    public List<Product> search(String name, double price) {
        return productRepository.findByName(name).map(List::of).orElse(List.of());
    }
}
