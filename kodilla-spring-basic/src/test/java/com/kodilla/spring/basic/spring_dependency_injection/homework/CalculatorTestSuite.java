package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorTest {

    @Autowired
    private Calculator calculator;

    @Test
    public void testAdd() {
        calculator.add(2, 3);
        assertEquals(5, 2 + 3, 0.001);
    }

    @Test
    public void testSubtract() {
        calculator.subtract(5, 3);
        assertEquals(2, 5 - 3, 0.001);
    }

    @Test
    public void testMultiply() {
        calculator.multiply(2, 3);
        assertEquals(6, 2 * 3, 0.001);
    }

    @Test
    public void testDivide() {
        calculator.divide(10, 2);
        assertEquals(5, 10 / 2, 0.001);
    }

    @Test
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }
}
