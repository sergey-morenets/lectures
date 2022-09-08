package capgemini.db.persistence;

import capgemini.db.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Optional<Product> findByName(String name);

    Optional<Product> findByNameAndPrice(String name, double price);

    @Query("SELECT p FROM Product p WHERE p.name=:name and p.price=:price")
    Optional<Product> search(@Param("name") String name, @Param("price") double price);
}
