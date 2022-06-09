package capgemini.spring.boot.repository;

import capgemini.spring.boot.model.Order;

public class OrderRepository {

    public Order findById(int id) {
        return new Order();
    }
}
