package capgemini.nosql.redis.persistence;

import capgemini.nosql.redis.model.User;
import org.springframework.data.keyvalue.repository.KeyValueRepository;

public interface UserRepository extends KeyValueRepository<User, Integer> {
}
