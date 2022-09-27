package capgemini.nosql.redis.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//TODO investigate how to avoid Serializable interface
public class Country implements Serializable {

    private int id;

    private String name;

    private String code;
}
