package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class ClockTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void shouldReturnDifferentTime() {
        Clock firstClock = context.getBean(Clock.class);
        Clock secondClock = context.getBean(Clock.class);
        assertNotEquals(firstClock.getTime(), secondClock.getTime());
    }
}