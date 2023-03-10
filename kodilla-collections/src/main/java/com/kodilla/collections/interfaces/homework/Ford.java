package com.kodilla.collections.interfaces.homework;
import com.kodilla.collections.arrays.homework.CarUtils;

public class Ford implements Car{

    private int speed;

    public Ford(int speed)
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
       speed = speed + 20;
       System.out.println("Acceleration: " + speed);
    }

    @Override
    public void decreaseSpeed()
    {
       speed = speed - 10;
       System.out.println("Reduction: " + speed);
    }
}
