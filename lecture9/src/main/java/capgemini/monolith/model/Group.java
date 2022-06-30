package capgemini.monolith.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Group {

    private int id;

    private String name;

    private List<Student> students;
}
