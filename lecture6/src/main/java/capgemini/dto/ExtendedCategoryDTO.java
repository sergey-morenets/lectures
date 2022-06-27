package capgemini.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ExtendedCategoryDTO {
    private int id;

    private String name;

    private List<ProductDTO> products;
}
