package com.kodilla.jacoco;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class YearTest {

    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {

        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldNotBeLeapYearIfNotDivisibleBy4() {
        // given
        Year year = new Year(2021);

        // when
        boolean isLeapYear = year.isLeap();

        // then
        assertFalse(isLeapYear);
    }

    @Test
    public void shouldBeLeapYearIfDivisibleBy4ButNotBy100() {
        // given
        Year year = new Year(2024);

        // when
        boolean isLeapYear = year.isLeap();

        // then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldNotBeLeapYearIfDivisibleBy100ButNotBy400() {
        // given
        Year year = new Year(1900);

        // when
        boolean isLeapYear = year.isLeap();

        // then
        assertFalse(isLeapYear);
    }
}
