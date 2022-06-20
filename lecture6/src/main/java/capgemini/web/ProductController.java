package capgemini.web;

import capgemini.dto.ProductDTO;
import capgemini.service.ProductService;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductController {

    private final Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    @Autowired
    private ProductService productService;

    @GetMapping("")
    public String helloWorld() {
        return "Hello, World";
    }

    @GetMapping("current")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public LocalDateTime currentDate() {
        return LocalDateTime.now();
    }

    @GetMapping("products")
    public List<ProductDTO> findAll(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam("price") Double price) {
        //ProductDTO productDTO = new ProductDTO();
        //copy all the fields from product to productDTO
        return productService.search(name, price).stream().map(product -> mapper.map(product, ProductDTO.class))
                .collect(Collectors.toList());
    }

    @GetMapping("products/{id}") //GET products/1
    public ProductDTO findOne(@PathVariable int id) {
        return new ProductDTO();
    }

    @PostMapping(value = "products")
    public void create(@RequestBody ProductDTO product) {
        // Save product
        System.out.println(product);
    }

    @PutMapping(value = "products/{id}")
    public void update(@PathVariable int id, @RequestBody ProductDTO product) {
        // Save product
        System.out.println(product);
    }

    @DeleteMapping(value = "products/{id}")
    public void delete(@PathVariable int id) {
        // Delete product
    }

//    @RequestMapping("products")
//    public String findAll() throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        return objectMapper.writeValueAsString(List.of(new Product()));
//    }
}
