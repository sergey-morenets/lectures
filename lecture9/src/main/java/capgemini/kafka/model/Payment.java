package capgemini.kafka.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment {

    private int id;

    private PaymentStatus status;

    private String errorMessage;
}
