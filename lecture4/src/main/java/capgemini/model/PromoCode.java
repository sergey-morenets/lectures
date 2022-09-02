package capgemini.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PromoCode {

    private int id;

    private String promo;

    private double discount;

    private boolean active;

    private LocalDateTime validUntil;
}
