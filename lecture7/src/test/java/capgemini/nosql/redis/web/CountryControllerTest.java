package capgemini.nosql.redis.web;

import capgemini.nosql.redis.model.Country;
import capgemini.nosql.redis.service.CountryService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class CountryControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    CountryService countryService;

    @Test
    void findById_IdValid_success() throws Exception {
        int countryId = 10;
        BDDMockito.given(countryService.findById(countryId)).willReturn(new Country(countryId, "Ukraine"));

        ResultActions actions = mockMvc.perform(get("/countries/" + countryId));
        actions.andExpect(status().isOk()).andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.name", Matchers.equalTo("Ukraine")));
        //CountryStorage storage = new DefaultCountryStorage();
//        CountryStorage storage = Mockito.mock(CountryStorage.class);
//        Mockito.when(storage.findById(any())).thenReturn(new Country(1, "Ukraine"));
//        CountryService countryService = new CountryService(storage);
        BDDMockito.verify(countryService).findById(countryId);
    }
}