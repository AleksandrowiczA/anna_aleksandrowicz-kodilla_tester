package wallet;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
    }

    @When("I request $30")
    public void i_request_$30() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 30);
    }

    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        Assert.assertEquals(30, cashSlot.getContents());
    }

    @And("the balance of my wallet should be $170")
    public void the_balance_of_my_wallet_should_be_$170() {
        Assert.assertEquals("Incorrect wallet balance", 170, wallet.getBalance());
    }
    @When("I request more money than available in the wallet")
    public void i_request_more_money_than_available_in_the_wallet() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 300); // Trying to withdraw more than the wallet balance
    }

    @Then("No money should be dispensed")
    public void no_money_should_be_dispensed() {
        Assert.assertEquals(0, cashSlot.getContents());
    }

    @When("I deposit a negative amount")
    public void i_deposit_a_negative_amount() {
        wallet.deposit(-50); // Depositing a negative amount
    }

    @When("I request $0")
    public void i_request_$0() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 0); // Withdrawing $0
    }

    @Then("No money should be dispensed from the slot")
    public void no_money_should_be_dispensed_from_the_slot() {
        Assert.assertEquals(0, cashSlot.getContents());
    }
}