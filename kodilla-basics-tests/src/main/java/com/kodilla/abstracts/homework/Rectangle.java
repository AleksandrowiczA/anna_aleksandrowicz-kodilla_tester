package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{

    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public void surfaceArea(double a, double b)
    {
        Rectangle rectangle = new Rectangle(a,b);
        double result;
        result = rectangle.getA() * rectangle.getB();
        System.out.println("Rectangle surface: " + result);
    }

    @Override
    public void circuit(double a, double b)
    {
        Rectangle rectangle = new Rectangle(a,b);
        double result;
        result = (rectangle.getA() * 2) + (rectangle.getB() * 2);
        System.out.println("Rectangle circuit: " + result);

    }
}
