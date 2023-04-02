package com.kodilla.execution_model.homework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Shop {
    private List<Order> orders;

    public Shop() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrdersInRange(Date startDate, Date endDate) {
        List<Order> ordersInRange = new ArrayList<>();
        for (Order order : orders) {
            Date orderDate = order.getDate();
            if (orderDate.compareTo(startDate) >= 0 && orderDate.compareTo(endDate) <= 0) {
                ordersInRange.add(order);
            }
        }
        return ordersInRange;
    }

    public List<Order> getOrdersByValueRange(double minValue, double maxValue) {
        List<Order> ordersByValueRange = new ArrayList<>();
        for (Order order : orders) {
            double orderValue = order.getValue();
            if (orderValue >= minValue && orderValue <= maxValue) {
                ordersByValueRange.add(order);
            }
        }
        return ordersByValueRange;
    }

    public int getNumberOfOrders() {
        return orders.size();
    }

    public double getTotalValueOfOrders() {
        double totalValue = 0.0;
        for (Order order : orders) {
            totalValue += order.getValue();
        }
        return totalValue;
    }
}
