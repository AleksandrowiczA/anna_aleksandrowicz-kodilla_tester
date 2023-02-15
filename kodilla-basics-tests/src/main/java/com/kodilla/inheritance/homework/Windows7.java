package com.kodilla.inheritance.homework;

public class Windows7 extends OperatingSystem{

    public Windows7(int year)
    {
        super(year);
    }
    @Override
    public void turnOn()
    {
        System.out.println("System Windows7 is starting....");
    }
    @Override
    public void turnOff()
    {
        System.out.println("System Windows7 is turning off...");
    }
}
