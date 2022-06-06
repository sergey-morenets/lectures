package capgemini.spring;

import lombok.Setter;

@Setter
public class ProductAPI {

    private Writer writer;

    public Product findProduct(int id) {
        writer.write("Product " + id + " found");
        return new Product(id, "Some name");
    }
}
