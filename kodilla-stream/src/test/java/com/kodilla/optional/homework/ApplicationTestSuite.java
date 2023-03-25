package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTestSuite {

    @Test
    public void testGetTeacherNameForValidPromoter() {

        Student janKowalski = new Student("Jan Kowalski", new Teacher("Edward Paczes"));

        Optional<Teacher> optionalTeacher = Optional.ofNullable(janKowalski.getTeacher());
        String teacherName = optionalTeacher.isPresent() ? optionalTeacher.get().getName() : "<undefined>";

        assertEquals("Edward Paczes", teacherName);
    }

    @Test
    public void testGetTeacherNameForInvalidPromoter() {

        Student ewaKowalska = new Student("Ewa Kowalska", null);

        Optional<Teacher> optionalTeacher = Optional.ofNullable(ewaKowalska.getTeacher());
        String teacherName = optionalTeacher.isPresent() ? optionalTeacher.get().getName() : "<undefined>";

        assertEquals("<undefined>", teacherName);
    }

}
