package capgemini.nosql.redis.persistence;

import capgemini.nosql.redis.RedisApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = RedisApplication.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void contextLoads() {

    }
}