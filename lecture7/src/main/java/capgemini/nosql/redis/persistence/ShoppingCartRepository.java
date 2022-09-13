package capgemini.nosql.redis.persistence;

import capgemini.nosql.redis.model.ShoppingCart;
import org.springframework.data.keyvalue.repository.KeyValueRepository;

public interface ShoppingCartRepository extends KeyValueRepository<ShoppingCart, Integer> {
}
