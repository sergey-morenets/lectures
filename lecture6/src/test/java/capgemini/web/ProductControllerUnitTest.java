package capgemini.web;

import capgemini.service.ProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
public class ProductControllerUnitTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    ProductService productService;

    void setup() {
        Runner runner = Mockito.mock(Runner.class);
        String result = runner.execute(); //null
        Mockito.when(runner.execute()).thenReturn("ok");
        result = runner.execute(); //ok

    }

    @Test
    @DisplayName("GET /products Search products by name without price returns 400")
    void search_priceMissing_clientError() throws Exception {
        BDDMockito.given(productService.search(null, null)).willReturn(List.of());

        MvcResult mvcResult = mockMvc.perform(get("/products")).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(HttpStatus.BAD_REQUEST.value(), status);
    }
}

interface Runner {

    void run();

    String execute();
}
