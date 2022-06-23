package capgemini.nosql.redis.persistence;

import capgemini.nosql.redis.RedisApplication;
import capgemini.nosql.redis.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = RedisApplication.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void findAll_keysExist_success() {
        User user = new User();
        user.setId(1);
        user.setAge(30);
        user.setName("Jack");
        userRepository.save(user);

        Iterable<User> users = userRepository.findAll();
        assertTrue(users.iterator().hasNext());
        User user1 = users.iterator().next();
        assertEquals(user.getId(), user1.getId());
    }
}