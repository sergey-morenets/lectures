package capgemini.microservice.common.model;

import java.time.LocalDateTime;

@Deprecated
public abstract class BaseEntity {

    private String id;

    private LocalDateTime createdAt;

    private LocalDateTime lastModifiedAt;
}
