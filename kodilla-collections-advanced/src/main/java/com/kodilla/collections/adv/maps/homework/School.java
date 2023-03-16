package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> students = new ArrayList<>();
    private final String schoolName;

    public School(String schoolName, List<Integer> students) {
        this.students = students;
        this.schoolName = schoolName;
    }

    public int getSumOfStudents() {
        int sum = 0;
        for (int student : students)
            sum += student;
        return sum;
    }

    public String getSchoolName() {
        return schoolName;
    }


    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
