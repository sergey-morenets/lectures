package capgemini.dto;

import com.github.dozermapper.core.Mapping;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private int id;

    @Mapping("title")
    private String name;

    private Double price;

    //private CategoryDTO category;
    @Mapping("category.id")
    private int categoryId;

    public static void main(String[] args) {
        ProductDTO product = new ProductDTO();
        product.setId(1);
        product.setName("Car");
        product.setPrice(100d);
        product.setCategoryId(10);
//        CategoryDTO category = new CategoryDTO();
//        product.setCategory(category);
//        product.getCategory().setId(0);
//        product.getCategory().setName("Cars");
        //should we enter category name?
        //should we enter category products?

    }
}
