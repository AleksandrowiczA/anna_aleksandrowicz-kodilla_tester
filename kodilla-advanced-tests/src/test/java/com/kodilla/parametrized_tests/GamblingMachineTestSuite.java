package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.GamblingMachine;
import com.kodilla.parametrized_tests.homework.InvalidNumbersException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

public class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/gameMachineNumbers.csv", numLinesToSkip = 1)
    void testHowManyWins(String userNumbers, String computerNumbers) throws InvalidNumbersException
    {
        Set<Integer> ints =
                Arrays.stream(userNumbers.split(","))
                        .map(Integer::parseInt)
                        .collect(Collectors.toSet());

        Set<Integer> comp =
                Arrays.stream(userNumbers.split(","))
                        .map(Integer::parseInt)
                        .collect(Collectors.toSet());

        Integer wins = GamblingMachine.howManyWins(ints,comp);


        assertEquals(5, wins);
    }
}
