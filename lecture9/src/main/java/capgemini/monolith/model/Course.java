package capgemini.monolith.model;

import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.util.List;

@Getter
@Setter
public class Course {

    private int id;

    private String name;

    private Duration duration;

    private List<Test> tests;
}
