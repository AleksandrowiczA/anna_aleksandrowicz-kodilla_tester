Feature: FizzBuzz Game

  Scenario Outline: Determine the FizzBuzz output for a given number
    Given a number <number>
    When I play the FizzBuzz game
    Then I should see the output as <output>

    Examples:
      | number | output    |
      | 3      | Fizz      |
      | 5      | Buzz      |
      | 15     | FizzBuzz  |
      | 7      | None      |
      | 30     | FizzBuzz  |
      | 11     | None      |
