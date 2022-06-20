package capgemini.persistence;

import capgemini.data.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByName(String name);

    List<Product> findByNameAndPrice(String name, Double price);

    //@Query("FROM Product p WHERE p.name = :name and price > :price")
    @Query(value = "SELECT * FROM PRODUCTS WHERE name=:name and price > :price", nativeQuery = true)
    List<Product> findSpecific(@Param("name") String name, @Param("price") Double price);
}
