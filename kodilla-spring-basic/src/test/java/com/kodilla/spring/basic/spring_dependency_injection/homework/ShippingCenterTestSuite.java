package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ShippingCenterTest {

    @Autowired
    private ShippingCenter shippingCenter;

    @Test
    public void shouldReturnSuccessMessage() {
        String result = shippingCenter.sendPackage("Krakow", 20.0);
        assertEquals("Package delivered to: Krakow", result);
    }

    @Test
    public void shouldReturnFailMessage() {
        String result = shippingCenter.sendPackage("Krakow", 50.0);
        assertEquals("Package not delivered to: Krakow", result);
    }
}
