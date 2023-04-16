package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
public class CarFactoryTestSuite {
    @Test
    public void shouldReturnCabrioForJune() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("getCar");

        String carType = car.getCarType();

        Assertions.assertEquals("Cabrio", carType);
    }

    @Test
    public void shouldReturnFalseWhenTimeIsNotBetween20and6() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("getCar");

        boolean lights = car.hasHeadlightsTurnedOn();

        assertFalse(lights);
    }


}
