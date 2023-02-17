package com.kodilla.abstracts.homework;

public class Triangle extends Shape{

    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }


    @Override
    public void surfaceArea()
    {
        double surface = (getA() * getH())/2;
        System.out.println("Triangle surface area equals:" + surface);
    }

    @Override
    public void circuit()
    {
        double circ = getA() + getB() + getC();
        System.out.println("Triangle circuit equals: " + circ);
    }

    public double getA()
    {
        return a;
    }
    public double getB()
    {
        return b;
    }
    public double getC()
    {
        return c;
    }
    public double getH()
    {
        return h;
    }
}
