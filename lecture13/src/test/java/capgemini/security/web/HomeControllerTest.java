package capgemini.security.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.security.test.context.support.WithAnonymousUser;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
public class HomeControllerTest<T> {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    JacksonTester<T> jacksonTester;

    @Test
    @WithMockUser(username = "admin")
    void hello_returnsGreeting() throws Exception {
        mockMvc.perform(get("/hello")).andExpect(status().isOk())
                .andExpect(content().string("admin,hello again from Capgemini"));
    }

    @Test
    @WithAnonymousUser
    void hello_userNotLogged_notAuthorized() throws Exception {
        mockMvc.perform(get("/hello")).andExpect(status().isUnauthorized());
    }
}