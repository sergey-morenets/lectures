package capgemini.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Category {
    private int id;

    private String name;

    private List<Product> products;
}
