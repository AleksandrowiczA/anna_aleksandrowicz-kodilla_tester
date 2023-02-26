package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Ford;
import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Ford> cars = new ArrayList<>();
        Ford ford1 = new Ford(100);
        cars.add(ford1);
        cars.add(new Ford(200));
        cars.add(new Ford(150));
        cars.add(new Ford(50));

        cars.remove(2);
        cars.remove(ford1);

        System.out.println(cars.size());

        for (Ford ford : cars) {
                CarUtils.describeCar(ford);
        }
    }
}
