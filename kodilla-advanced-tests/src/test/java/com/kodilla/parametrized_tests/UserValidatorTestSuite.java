package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.UserValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    UserValidator userValidator = new UserValidator();
    @ParameterizedTest
    @ValueSource(strings = {"kowalska", "KOwalska", "K-O-w123", "123", "KAO" })
    public void shouldReturnTrueForUsernamesWithMin3DigitsOrMore(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"u#er", "us","user+name"})
    public void shouldReturnFalseForUsernamesWithLessThan3DigitsOrSignsNotAddedInRegexExpression(String username) {
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"anna.aleksan23@interia.eu", "john.doe@example.com", "jane_doe@example.co.uk", "my.email123@example.net", "example@example.co.jp"})
    public void shouldReturnTrueForEmailsThatMatchesRegexPattern(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"@example.com", "john.doe@", "john.doe@example."})
    public void shouldReturnFalseForInvalidEmailStartingWithAtSymbolOrEndingWithDot(String email) {
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"John Doe <john.doe@example.com>", "example.com", "john.doe"})
    public void shouldReturnFalseForInvalidEmailWithInvalidCharacters(String email) {
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }






}
