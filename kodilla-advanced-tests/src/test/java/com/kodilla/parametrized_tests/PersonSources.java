package com.kodilla.parametrized_tests;
import com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> providePeopleForBmiTest() {
        return Stream.of(
                Arguments.of(new Person(1.65, 40), "Very severely underweight"),
                Arguments.of(new Person(1.60, 40), "Severely underweight"),
                Arguments.of(new Person(1.80, 57), "Underweight"),
                Arguments.of(new Person(1.75, 70), "Normal (healthy weight)"),
                Arguments.of(new Person(1.75, 86), "Overweight"),
                Arguments.of(new Person(1.75, 103), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.75, 120), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.75, 137), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.75, 152), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.75, 171), "Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.75, 188), "Obese Class VI (Hyper Obese)")
        );
    }

}