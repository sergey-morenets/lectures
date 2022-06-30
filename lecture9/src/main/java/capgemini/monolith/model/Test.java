package capgemini.monolith.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Test {

    private int id;

    private String name;

    private String technology;

    private List<Question> questions;
}
