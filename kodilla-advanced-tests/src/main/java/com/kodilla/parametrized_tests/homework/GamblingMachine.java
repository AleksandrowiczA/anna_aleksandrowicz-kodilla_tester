package com.kodilla.parametrized_tests.homework;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class GamblingMachine {

    public static int howManyWins(Set<Integer> userNumbers, Set<Integer> computerNumbers) throws InvalidNumbersException {
        validateNumbers(userNumbers);
        validateNumbers(computerNumbers);
        int count = 0;
        for (Integer number : userNumbers) {
            if (computerNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }

    private static void validateNumbers(Set<Integer> numbers) throws InvalidNumbersException {
        if (isNotCorrectSize(numbers) || isAnyNumberOutOfDeclaredScope(numbers)) {
            throw new InvalidNumbersException();
        }
    }

    private static boolean isAnyNumberOutOfDeclaredScope(Set<Integer> numbers) {
        return numbers.stream()
                .anyMatch(number -> number < 1 || number > 49);
    }

    private static boolean isNotCorrectSize(Set<Integer> numbers) {
        return numbers.size() != 6;
    }

    public static Set<Integer> generateComputerNumbers() {
        Set<Integer> computerNumbers = new HashSet<>();
        Random generator = new Random();
        while(computerNumbers.size() < 6) {
            computerNumbers.add(generator.nextInt(49) + 1);
        }
        return computerNumbers;
    }
}