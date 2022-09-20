package capgemini.web.controller;

import capgemini.web.dto.UserDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
class UserControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    JacksonTester<UserDTO> jacksonTester;

    @Test
    @DisplayName("GET /users returns existing users")
    void findAll_dataStoreNotEmpty_success() throws Exception {
        ResultActions actions = mockMvc.perform(get("/users"));
        actions.andExpect(status().isOk()).andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(2)));
//        MvcResult mvcResult = actions.andReturn();
//        mvcResult.getResponse().getContentAsString();
//        mvcResult.getResponse().getStatus();
    }

    @Test
    void register_validUser_success() throws Exception {
        UserDTO userDTO = new UserDTO(1, "jack", 50);

        ResultActions actions = mockMvc.perform(post("/users")
                .contentType(MediaType.APPLICATION_JSON).content(jacksonTester.write(userDTO).getJson()));
        actions.andExpect(status().isCreated());
    }
}