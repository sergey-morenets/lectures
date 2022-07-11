package capgemini.microservice.student.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
//@Setter
public enum Country {

    UKRAINE(1, "UKRAINE", "UA"), POLAND(2, "POLAND", "POL");

    private final int id;

    private final String name;

    private final String code;
}
