package capgemini.web;

import capgemini.dto.ProductDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
class ProductControllerTest {

    @Autowired
    JacksonTester<ProductDTO> productTester;

    @Autowired
    MockMvc mockMvc;

    @Test
    @DisplayName("GET /products Search products by name without price returns 400")
    void search_priceMissing_clientError() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/products")).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(HttpStatus.BAD_REQUEST.value(), status);
    }

    @Test
    @DisplayName("GET /products?price=100 Search products by name returns single product")
    void search_allQueryParametersPresent_singleProduct() throws Exception {
        mockMvc.perform(get("/products?price=100")).andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    @DisplayName("POST /products Creates new product")
    void create_validProduct_success() throws Exception {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(1);
        productDTO.setName("Education");
        productDTO.setPrice(1000d);

//        ObjectMapper objectMapper = new ObjectMapper();
//        String json = objectMapper.writeValueAsString(productDTO);
        mockMvc.perform(post("/products").contentType(MediaType.APPLICATION_JSON)
                .content(productTester.write(productDTO).getJson())).andExpect(status().isOk());
        ;
    }
}