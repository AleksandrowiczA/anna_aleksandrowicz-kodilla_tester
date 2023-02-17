package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{

    private double a;
    private double b;

    public Rectangle(double a, double b)
    {
        this.a = a;
        this.b = b;
    }


    @Override
    public void surfaceArea()
    {
        double surface = getA() * getB();
        System.out.println("Rectangle surface area equals: " + surface);
    }

    @Override
    public void circuit()
    {
        double circ = 2 * getA() + 2 * getB();
        System.out.println("Rectangle circuit equals: " + circ);
    }

    public double getA()
    {
        return a;
    }

    public double getB()
    {
        return b;
    }
}
