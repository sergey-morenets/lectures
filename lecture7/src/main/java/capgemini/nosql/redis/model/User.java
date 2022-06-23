package capgemini.nosql.redis.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("users")
@Setter
@Getter
public class User {

    @Id
    private int id;

    private String name;

    private int age;
}
