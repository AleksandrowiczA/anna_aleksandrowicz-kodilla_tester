package FizzBuzz;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FizzBuzzSteps {
    private int number;
    private String output;

    @Given("a number {int}")
    public void a_number1(Integer number) {
        this.number = number;
    }


    @When("I play the FizzBuzz game")
    public void i_play_the_fizz_buzz_game() {
        if (number % 3 == 0 && number % 5 == 0) {
            output = "FizzBuzz";
        } else if (number % 3 == 0) {
            output = "Fizz";
        } else if (number % 5 == 0) {
            output = "Buzz";
        } else {
            output = String.valueOf(number);
        }
    }

    @Then("I should see the output as Fizz")
    public void i_should_see_the_output_as_fizz() {
        assert output.equals("Fizz");
    }

    @Then("I should see the output as Buzz")
    public void i_should_see_the_output_as_buzz() {
        assert output.equals("Buzz");
    }

    @Then("I should see the output as FizzBuzz")
    public void i_should_see_the_output_as_fizz_buzz() {
        assert output.equals("FizzBuzz");
    }

    @Then("I should see the output as None")
    public void i_should_see_the_output_as_none() {
        assert output.equals(String.valueOf(number));
    }
}