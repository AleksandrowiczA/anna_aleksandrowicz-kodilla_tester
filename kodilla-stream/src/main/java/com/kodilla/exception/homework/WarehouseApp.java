package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {

    public static void main(String[] args) {


        List<Order> orders = new ArrayList<>();
        orders.add(new Order("123234"));
        orders.add(new Order("783542"));
        orders.add(new Order("997623"));
        orders.add(new Order("889243"));
        orders.add(new Order("008123"));

        try {
            Order order = Warehouse.getOrder("12234", orders);
            System.out.println("Found order: " + order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Order does not exist");
        }

    }

}
