package capgemini.cloud.repository;

import capgemini.cloud.model.Product;

import java.util.Optional;

public interface ProductRepository {

    Optional<Product> findByName(String name);
}
