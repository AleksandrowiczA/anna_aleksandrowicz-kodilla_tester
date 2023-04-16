package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
@Configuration
public class CarFactory {

    @Bean
    public Car getCar() {
        LocalTime time = LocalTime.now();
        String month = "JUNE";
        if (month == "JUNE" || month == "JULY" || month == "AUGUST") {
            return new Cabrio();
        } else if (month == "DECEMBER" || month == "JANUARY" || month == "FEBRUARY") {
            return new Suv();
        } else {
            return new Sedan();
        }
    }
}

