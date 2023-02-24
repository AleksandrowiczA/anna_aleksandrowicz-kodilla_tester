package com.kodilla.collections.interfaces.homework;

public class Cupra implements Car{
    private int speed;

    public Cupra(int speed)
    {
        this.speed = speed;
    }
    @Override
    public int getSpeed()
    {
        return speed;
    }

    @Override
    public void increaseSpeed()
    {
        speed = speed + 30;
        System.out.println("Acceleration: " + speed);
    }

    @Override
    public void decreaseSpeed()
    {
        speed = speed - 20;
        System.out.println("Reduction: " + speed);
    }
}
