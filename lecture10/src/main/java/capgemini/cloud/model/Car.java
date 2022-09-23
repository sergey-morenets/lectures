package capgemini.cloud.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@Document("cars")
public class Car {

    @Id
    private String id;

    @Indexed
    private String model;

    private int year;

    private double price;

    @CreatedDate
    private LocalDateTime createdAt;
    //private BsonId anotherId;
}
