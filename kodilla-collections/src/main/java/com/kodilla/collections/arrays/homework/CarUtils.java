package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Cupra;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {


    public static void describeCar(Car car)
    {
        System.out.println("-----------------------------");
        System.out.println("Brand of car: " + getCarBrand(car));
        System.out.println("Speed: " + car.getSpeed());
    }

    private static String getCarBrand(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Cupra)
            return "Cupra";
        else
            return "Unknown car brand";
    }
}
