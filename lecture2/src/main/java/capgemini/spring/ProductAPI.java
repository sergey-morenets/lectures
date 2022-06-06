package capgemini.spring;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Setter
public class ProductAPI {

    @Autowired
    private Writer writer;

    public Product findProduct(int id) {
        writer.write("Product " + id + " found");
        return new Product(id, "Some name");
    }
}
