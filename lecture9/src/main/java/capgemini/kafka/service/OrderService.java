package capgemini.kafka.service;

import capgemini.kafka.event.IntegrationEvent;
import capgemini.kafka.event.OrderCreatedEvent;
import capgemini.kafka.model.Order;
import capgemini.kafka.persistence.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    private final KafkaTemplate<Integer, IntegrationEvent> kafkaTemplate;

    public void create(Order order) {
        orderRepository.save(order);

        kafkaTemplate.send("orders", order.getId(), new OrderCreatedEvent(order.getId()));

    }
}
