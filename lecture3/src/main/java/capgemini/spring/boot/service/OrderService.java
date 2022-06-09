package capgemini.spring.boot.service;

import capgemini.spring.boot.model.Order;
import capgemini.spring.boot.repository.OrderRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public Order findById(int id) {
        return orderRepository.findById(id);
    }
}
