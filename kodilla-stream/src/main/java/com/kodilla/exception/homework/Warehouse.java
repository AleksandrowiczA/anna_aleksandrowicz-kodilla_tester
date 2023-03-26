package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    public List<String> addOrder(Order order)
    {
        List<String> orders = new ArrayList<>();
        orders.add(order.number);
        return orders;
    }

    public static Order getOrder(String number, List<Order> orders) throws OrderDoesntExistException
    {
        Order order = orders.stream()
                .filter(o-> o.getNumber().equals(number))
                .findFirst()
                .orElse(null);
        if (order == null)
        {
            throw new OrderDoesntExistException();
        }
        return order;
    }
}
