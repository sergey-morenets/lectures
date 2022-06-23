package capgemini.nosql.redis.persistence;

import capgemini.nosql.redis.model.User;
import org.springframework.data.keyvalue.repository.KeyValueRepository;

import java.util.List;

public interface UserRepository extends KeyValueRepository<User, Integer> {

    List<User> findByAge(int age);

    @Override
    List<User> findAll();
}
