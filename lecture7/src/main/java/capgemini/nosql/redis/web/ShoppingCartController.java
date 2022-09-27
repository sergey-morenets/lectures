package capgemini.nosql.redis.web;

import capgemini.nosql.redis.model.ShoppingCart;
import capgemini.nosql.redis.persistence.ShoppingCartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("carts")
@RequiredArgsConstructor
public class ShoppingCartController {

    private final ShoppingCartRepository shoppingCartRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody ShoppingCart shoppingCart) {
        shoppingCartRepository.save(shoppingCart);
    }


    @PostMapping("{cartId}/items")
    public void addCartItem(@PathVariable int cartId) {

    }
}
