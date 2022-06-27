package capgemini.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {

    private int id;

    private String title;

    private Double price;

    private Category category;
}
