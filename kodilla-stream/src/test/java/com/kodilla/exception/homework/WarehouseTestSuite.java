package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    public void testGetOrder_withException()
    {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("123234"));
        orders.add(new Order("783542"));
        orders.add(new Order("997623"));

        assertThrows(OrderDoesntExistException.class, () -> Warehouse.getOrder("120234", orders));
    }

}