package capgemini.product.api;

import capgemini.product.dto.ProductDTO;

import java.util.List;

public interface ProductClient {

    List<ProductDTO> findAll();

    ProductDTO findById(int id);

    void create(ProductDTO product);

    void update(int id, ProductDTO product);

    int delete(int id);
}
