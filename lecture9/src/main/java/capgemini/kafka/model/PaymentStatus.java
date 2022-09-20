package capgemini.kafka.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PaymentStatus {
    //CREATED -> IN_PROGRESS-> PAYED
    //CREATED -> IN_PROGRESS-> DECLINED
    CREATED, PAYED, IN_PROGRESS, DECLINED;

    private String description;
}
