package capgemini.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItem {

    private int id;

    private Product product;

    private int amount;
}
