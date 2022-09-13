package capgemini.nosql.redis.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("carts")
public class ShoppingCart {

    @Id
    private int id;

    private String username;
}
