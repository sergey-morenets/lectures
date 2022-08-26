package capgemini.spring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringJUnitConfig(classes = CustomConfiguration.class)
class ServerTest {

    @Autowired
    Server server;

    @BeforeEach
    void setup() {
    }

    @Test
    void start_serverCreated_success() {
        server.start();
        assertTrue(server.isStarted());
    }

    @Test
    void stop() {
    }
}