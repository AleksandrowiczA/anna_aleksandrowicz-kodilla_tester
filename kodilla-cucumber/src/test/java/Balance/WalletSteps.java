package Balance;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class WalletSteps {
    private Wallet wallet;
    private String errorMessage;
    private int balance;

    @Given("there is ${int} in my wallet")
    public void thereIsAmountInMyWallet(int amount) {
        wallet = new Wallet(amount);
    }

    @When("I withdraw ${int}")
    public void iWithdrawAmount(int amount) {
        try {
            wallet.withdraw(amount);
        } catch (IllegalArgumentException e) {
            errorMessage = e.getMessage();
        }
    }

    @Then("nothing should be dispensed")
    public void nothingShouldBeDispensed() {
        // Add code to verify that nothing is dispensed
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void iShouldBeToldThatIDontHaveEnoughMoneyInMyWallet() {
        assertEquals("Not enough money in the wallet", errorMessage);
    }

    @When("I check the balance of my wallet")
    public void iCheckTheBalanceOfMyWallet() {
        balance = wallet.getBalance();
    }

    @Then("I should see that the balance is ${int}")
    public void iShouldSeeThatTheBalanceIs(int expectedBalance) {
        assertEquals(expectedBalance, balance);
    }
}
