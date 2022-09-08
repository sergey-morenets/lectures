package capgemini.db.model;

import java.time.LocalDateTime;

public class Payment {

    private static final String STATE_CREATED = "created";

    private static final String STATE_COMLETED = "completed";

    private static final String STATE_REJECTED = "rejected";

    private static final String STATE_UNKNOWN = "unknown";

    private int id;

    private LocalDateTime createdAt;

    private PaymentState state;

    public Payment() {
        //state = "new";
        state = PaymentState.CREATED;
    }

    public void setId(int id) {
        this.id = id;
    }
}
