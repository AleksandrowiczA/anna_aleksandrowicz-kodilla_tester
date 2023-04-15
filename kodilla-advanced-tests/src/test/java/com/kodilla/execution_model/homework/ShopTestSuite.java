package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ShopTestSuite {

    private Shop shop;

    @BeforeEach
    public void setUp() {
        shop = new Shop();
    }

    @Test
    public void testAddOrder() {
        Order order = new Order(10.0, new Date(), "John Doe");
        shop.addOrder(order);
        Assertions.assertEquals(1, shop.getNumberOfOrders());
    }

    @Test
    public void testGetOrdersInRange() {
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.JANUARY, 1);
        Date startDate = cal.getTime();
        cal.set(2023, Calendar.DECEMBER, 31);
        Date endDate = cal.getTime();

        Order order1 = new Order(100.0, new Date(), "John Doe");
        shop.addOrder(order1);
        Order order2 = new Order(200.0, startDate, "Jane Doe");
        shop.addOrder(order2);
        Order order3 = new Order(300.0, endDate, "Jack Smith");
        shop.addOrder(order3);

        List<Order> ordersInRange = shop.getOrdersInRange(startDate, endDate);
        Assertions.assertEquals(3, ordersInRange.size());
        Assertions.assertTrue(ordersInRange.contains(order2));
        Assertions.assertTrue(ordersInRange.contains(order3));
    }

    @Test
    public void testGetOrdersByValueRange() {
        Order order1 = new Order(100.0, new Date(), "John Doe");
        shop.addOrder(order1);
        Order order2 = new Order(200.0, new Date(), "Jane Doe");
        shop.addOrder(order2);
        Order order3 = new Order(300.0, new Date(), "Jack Smith");
        shop.addOrder(order3);

        List<Order> ordersByValueRange = shop.getOrdersByValueRange(150.0, 250.0);
        Assertions.assertEquals(1, ordersByValueRange.size());
        Assertions.assertTrue(ordersByValueRange.contains(order2));
    }

    @Test
    public void testGetNumberOfOrders() {
        Order order1 = new Order(100.0, new Date(), "John Doe");
        shop.addOrder(order1);
        Order order2 = new Order(200.0, new Date(), "Jane Doe");
        shop.addOrder(order2);
        Order order3 = new Order(300.0, new Date(), "Jack Smith");
        shop.addOrder(order3);

        Assertions.assertEquals(3, shop.getNumberOfOrders());
    }

    @Test
    public void testGetTotalValueOfOrders() {
        Order order1 = new Order(100.0, new Date(), "John Doe");
        shop.addOrder(order1);
        Order order2 = new Order(200.0, new Date(), "Jane Doe");
        shop.addOrder(order2);
        Order order3 = new Order(300.0, new Date(), "Jack Smith");
        shop.addOrder(order3);

        Assertions.assertEquals(600.0, shop.getTotalValueOfOrders(), 0.001);
    }
}