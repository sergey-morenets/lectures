package capgemini.spring.boot.service;

import capgemini.spring.boot.MainApplication;
import capgemini.spring.boot.model.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringJUnitConfig(classes = MainApplication.class)
class OrderServiceTest {

    @Autowired
    OrderService orderService;

    @Test
    void findById_validId_success() {
        Order order = orderService.findById(1);
        assertNotNull(order);
    }
}