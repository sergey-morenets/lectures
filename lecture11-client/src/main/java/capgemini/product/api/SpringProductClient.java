package capgemini.product.api;

import capgemini.product.dto.ProductDTO;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

import java.util.List;

public class SpringProductClient implements ProductClient {
    private final RestTemplate restTemplate;

    public SpringProductClient() {
        restTemplate = new RestTemplate();
        restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory
                ("http://products:8080/products"));
    }

    @Override
    public List<ProductDTO> findAll() {
        return null;
    }

    @Override
    public ProductDTO findById(int id) {
        return null;
    }

    @Override
    public void create(ProductDTO product) {

    }

    @Override
    public void update(int id, ProductDTO product) {

    }

    @Override
    public int delete(int id) {
        return 0;
    }
}
