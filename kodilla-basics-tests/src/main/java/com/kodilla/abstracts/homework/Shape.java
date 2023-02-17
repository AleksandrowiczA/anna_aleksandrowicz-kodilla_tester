package com.kodilla.abstracts.homework;

public abstract class Shape{
    private double a;
    private double b;
    public Shape(double a, double b)
    {
       this.a = a;
       this.b = b;
    }
    public abstract void surfaceArea(double a, double b);
    public abstract void circuit(double a, double b);

    public double getA()
    {
        return a;
    }

    public double getB()
    {
        return b;
    }
}
