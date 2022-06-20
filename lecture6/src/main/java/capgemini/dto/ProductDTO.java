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
}
