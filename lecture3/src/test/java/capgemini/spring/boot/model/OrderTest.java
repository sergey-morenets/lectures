package capgemini.spring.boot.model;

import org.junit.jupiter.api.Test;

class OrderTest {

    Order order = new Order();

    @Test
    void testOrderWorkflow() {
        //init delivery
        order.delivery();

        //payments
        order.pay();

        //completion
        order.complete();

        //creation stuff
        order.create();
    }
}