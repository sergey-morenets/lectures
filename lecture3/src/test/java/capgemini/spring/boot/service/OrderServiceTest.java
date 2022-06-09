package capgemini.spring.boot.service;

import capgemini.spring.boot.model.Order;
import capgemini.spring.boot.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertSame;

//@SpringJUnitConfig(classes = MainApplication.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class OrderServiceTest {

    @MockBean
    OrderRepository orderRepository;

    @Autowired
    OrderService orderService;

    @Test
    void findById_validId_success() {
        Order ourOrder = new Order();
        BDDMockito.given(orderRepository.findById(1)).willReturn(ourOrder);

        Order order = orderService.findById(1);
        // assertNotNull(order);
        assertSame(ourOrder, order);

        BDDMockito.verify(orderRepository).findById(1);
    }
}