package capgemini.nosql.redis.model;

import java.time.LocalDateTime;

public abstract class BaseEntity {

    protected BaseEntity() {
        createdAt = LocalDateTime.now();
    }

    private LocalDateTime createdAt;


}
