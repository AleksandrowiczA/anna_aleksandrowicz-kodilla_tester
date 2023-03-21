package com.kodilla.collections.adv.excercises.homework;

import com.kodilla.collections.adv.excercises.dictionary.EnglishWord;

import java.util.*;

public class FlightRepository {

   public static List<Flight> getFlightsTable()
   {
       List<Flight> flights = new ArrayList<>();
       flights.add(new Flight("Warsaw", "Rome"));
       flights.add(new Flight("Rome", "Warsaw"));
       flights.add(new Flight("London", "New York"));
       flights.add(new Flight("Moscow", "Rome"));
       flights.add(new Flight("Rome", "Moscow"));
       flights.add(new Flight("New York", "London"));
       flights.add(new Flight("Rome", "London"));
       flights.add(new Flight("Warsaw", "Milan"));
       return flights;
   }

}
