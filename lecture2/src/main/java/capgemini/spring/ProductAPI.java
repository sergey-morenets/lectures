package capgemini.spring;

import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
public class ProductAPI {

    //@Autowired
    private final Writer writer;

    //@Autowired
    public ProductAPI(Writer writer) {
        this.writer = writer;
    }

    public Product findProduct(int id) {
        writer.write("Product " + id + " found");
        return new Product(id, "Some name");
    }

//    @Autowired
//    public void setWriter(Writer writer) {
//        this.writer = writer;
//    }
}
