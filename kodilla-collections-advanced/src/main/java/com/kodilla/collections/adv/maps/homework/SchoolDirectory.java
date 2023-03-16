package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolsDivision = new HashMap<>();

        Principal edward = new Principal("Edward", "Smith");
        Principal jane = new Principal("Jane", "Kowalski");
        Principal howard = new Principal("Howard", "Lawrence");
        Principal lois = new Principal("Lois", "Pitt");

        School benjamin = new School("The Benjamin School", Arrays.asList(15, 17, 23, 14, 25, 32));
        School xavier = new School("Xavier High School", Arrays.asList(14, 22, 21, 20, 13, 32));
        School eleanor = new School("Eleanor Roosvelt High School", Arrays.asList(25, 17, 18, 14, 25, 29));
        School liberty = new School("M550 Liberty High School", Arrays.asList(15, 25, 23, 11, 27, 10));

        schoolsDivision.put(edward, xavier);
        schoolsDivision.put(jane, liberty);
        schoolsDivision.put(howard, benjamin);
        schoolsDivision.put(lois, eleanor);

        for (Map.Entry<Principal, School> schoolEntry : schoolsDivision.entrySet()) {
            System.out.println("Principal: " + schoolEntry.getKey().getFirstname() + " " + schoolEntry.getKey().getLastname() + ", School name: " + schoolEntry.getValue().getSchoolName() + ", number of students: " + schoolEntry.getValue().getSumOfStudents());

        }


    }
}
