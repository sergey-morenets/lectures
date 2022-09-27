package capgemini.nosql.redis.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.OneToMany;
import java.util.List;

@RedisHash("carts")
public class ShoppingCart {

    @Id
    private int id;

    private String username;

    @OneToMany
    private List<CartItem> items;
}
