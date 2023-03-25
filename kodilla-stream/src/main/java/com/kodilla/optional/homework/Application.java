package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> promoters = new ArrayList<>();

        promoters.add(new Student("Jan Kowalski", new Teacher("Edward Paczes")));
        promoters.add(new Student("Edyta Janus", new Teacher("Zdzisław Gajda")));
        promoters.add(new Student("Michał Nowak", new Teacher("Ewelina Suchecka")));
        promoters.add(new Student("Ewa Kowalska", null));
        promoters.add(new Student("Patrycja Gaj", new Teacher("Maria Stepień")));
        promoters.add(new Student("Wojciech Marszolik", new Teacher("Tomasz Baron")));
        promoters.add(new Student("Mateusz Durka", null));


        for (Student student : promoters)
        {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            System.out.println("uczeń: " + student.getName() + "   nauczyciel:  " + (optionalTeacher.isPresent() ? optionalTeacher.get().getName() : "<undefined>"));
        }

    }
}
