package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource("com.kodilla.parametrized_tests.PersonSources#providePeopleForBmiTest")
    public void shouldReturnCorrectBmiValue(Person person, String expectedBmiCategory) {

        String actualBmiCategory = person.getBMI();

        assertEquals(expectedBmiCategory, actualBmiCategory);
    }

}
