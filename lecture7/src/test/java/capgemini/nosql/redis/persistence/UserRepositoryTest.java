package capgemini.nosql.redis.persistence;

import capgemini.nosql.redis.RedisApplication;
import capgemini.nosql.redis.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.keyvalue.core.KeyValueTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = RedisApplication.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Autowired
    KeyValueTemplate keyValueTemplate;

    @Test
    public void findAll_keysExist_success() {
        long count = userRepository.count();
        User user = new User();
        user.setId(1);
        user.setAge(30);
        user.setName("Jack");
        userRepository.save(user);

        //TODO fix this test
        List<User> users = userRepository.findAll();
        assertEquals(count + 1, users.size());
        assertEquals(user.getId(), users.get(0).getId());
    }

    @Test
    public void findByAge_ageExists_success() {
        User user = new User();
        user.setId(2);
        user.setAge(40);
        user.setName("Paul");
        userRepository.save(user);

        List<User> users = userRepository.findByAge(user.getAge());
        assertEquals(1, users.size());
        assertEquals(user.getId(), users.get(0).getId());
    }
}