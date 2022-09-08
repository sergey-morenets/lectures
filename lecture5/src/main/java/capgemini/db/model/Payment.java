package capgemini.db.model;

import java.time.LocalDateTime;

public class Payment {

    private static final String STATE_CREATED = "created";

    private static final String STATE_COMLETED = "completed";

    private static final String STATE_REJECTED = "rejected";

    private int id;

    private LocalDateTime createdAt;

    private String state;

    public Payment() {
        state = STATE_CREATED;
    }
}
