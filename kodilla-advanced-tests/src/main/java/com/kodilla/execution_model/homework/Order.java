package com.kodilla.execution_model.homework;

import java.util.Date;

public class Order {
    private double value;
    private Date date;
    private String username;

    public Order(double value, Date date, String username) {
        this.value = value;
        this.date = date;
        this.username = username;
    }

    public double getValue() {
        return value;
    }

    public Date getDate() {
        return date;
    }

    public String getUsername() {
        return username;
    }
}
