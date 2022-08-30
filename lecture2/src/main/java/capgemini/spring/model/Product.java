package capgemini.spring.model;

import java.util.HashSet;
import java.util.Set;

public class Product {

    private int id;

    private String name;

    private double price;

    //private ArrayList<Order> orders;

    private Set<Order> orders;

    //SOLID principles

    //1.Set<Order> orders
    //2.HashSet<Order> orders
    //3.List<Order> orders
    //4.ArrayList<Order> orders
    //5.Collection<Order> orders
    //6.List<Integer> orders

    public void addOrder(Order order) {

        orders = new HashSet<>();
        orders.add(order);
        orders.add(order);

    }
}
