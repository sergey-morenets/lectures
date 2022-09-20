package capgemini.db.persistence;

import capgemini.db.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Optional<Product> findByName(String name);

    List<Product> findByPrice(double price);

    List<Product> findByCategory(String category);
//
//    Optional<Product> findByNameAndPrice(String name, double price);
//
//    @Query("SELECT p FROM Product p WHERE p.name=:name and p.price=:price")
//    //@Query(value = "SELECT p FROM PRODUCTS p WHERE p.PRODUCT_NAME=:name and p.price=:price", nativeQuery = true)
//    Optional<Product> search(@Param("name") String name, @Param("price") double price);
}
