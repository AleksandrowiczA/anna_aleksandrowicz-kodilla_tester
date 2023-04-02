package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.GamblingMachine;
import com.kodilla.parametrized_tests.homework.InvalidNumbersException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

public class GamblingMachineTestSuite {

    private final GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gameMachineNumbers.csv", numLinesToSkip = 1)
    public void testHowManyWinsWithCsvInput(String input) throws InvalidNumbersException {
        String[] numbers = input.split(",");
        Set<Integer> userNumbers = new HashSet<>();
        for (String number : numbers) {
            userNumbers.add(Integer.parseInt(number));
        }
        int expectedWins = 0;
        int actualWins = machine.howManyWins(userNumbers);
        Assertions.assertEquals(expectedWins, actualWins);
    }



}
