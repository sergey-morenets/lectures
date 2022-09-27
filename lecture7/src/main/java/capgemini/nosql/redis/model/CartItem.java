package capgemini.nosql.redis.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Table
@Entity
public class CartItem {

    private int id;

    private int amount;

    private Product product;

    private ShoppingCart shoppingCart;
}
