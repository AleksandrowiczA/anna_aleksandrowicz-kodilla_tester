package Balance;

public class Wallet {
    private int balance;

    public Wallet(int initialBalance) {
        balance = initialBalance;
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Not enough money in the wallet");
        }


        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}