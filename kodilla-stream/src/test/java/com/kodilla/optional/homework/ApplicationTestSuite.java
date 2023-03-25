package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTestSuite {

    @Test
    public void testGetTeacherNameForValidPromoter() {
        // arrange
        Student janKowalski = new Student("Jan Kowalski", new Teacher("Edward Paczes"));

        // act
        Optional<Teacher> optionalTeacher = Optional.ofNullable(janKowalski.getTeacher());
        String teacherName = optionalTeacher.isPresent() ? optionalTeacher.get().getName() : "<undefined>";

        // assert
        assertEquals("Edward Paczes", teacherName);
    }

    @Test
    public void testGetTeacherNameForInvalidPromoter() {
        // arrange
        Student ewaKowalska = new Student("Ewa Kowalska", null);

        // act
        Optional<Teacher> optionalTeacher = Optional.ofNullable(ewaKowalska.getTeacher());
        String teacherName = optionalTeacher.isPresent() ? optionalTeacher.get().getName() : "<undefined>";

        // assert
        assertEquals("<undefined>", teacherName);
    }

}
