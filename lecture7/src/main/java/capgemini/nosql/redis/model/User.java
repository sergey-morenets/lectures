package capgemini.nosql.redis.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@RedisHash("users")
@Setter
@Getter
public class User {

    @Id
    private int id;

    private String name;

    @Indexed
    private int age;
}
