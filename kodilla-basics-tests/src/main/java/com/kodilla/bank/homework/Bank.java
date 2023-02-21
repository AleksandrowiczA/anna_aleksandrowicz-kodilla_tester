package com.kodilla.bank.homework;

public class Bank {

    private CashMachine santander;
    private CashMachine bnp;
    private CashMachine getinbank;
    CashMachine[] machines = {santander, bnp, getinbank};

    public Bank()
    {
        this.santander = new CashMachine();
        this.bnp = new CashMachine();
        this.getinbank = new CashMachine();
    }
    public static void main(String[] args) {

      Bank bank = new Bank();
      bank.addToSantander();
      bank.addToGetInBank();
      bank.addToBnp();
      System.out.println(bank.santander.getbalance());
      System.out.println(bank.getBalanceOfMachines());
      System.out.println(bank.santander.numberOfCashOut());
      System.out.println(bank.santander.numberOfCashIn());
      System.out.println(bank.santander.averageOfCashOut());
      System.out.println(bank.santander.averageOfCashIn());

    }
    public void addToSantander()
    {
        santander.addTransaction(1987);
        santander.addTransaction(1954);
        santander.addTransaction(3765);
        santander.addTransaction(-5467);
        santander.addTransaction(-200);
        santander.addTransaction(-1987);
    }
    public void addToBnp()
    {
        bnp.addTransaction(700);
        bnp.addTransaction(3452);
        bnp.addTransaction(-100);
        bnp.addTransaction(-5000);
        bnp.addTransaction(-200);
        bnp.addTransaction(-3000);
    }
    public void addToGetInBank()
    {
        getinbank.addTransaction(8765);
        getinbank.addTransaction(543);
        getinbank.addTransaction(987);
        getinbank.addTransaction(-6543);
        getinbank.addTransaction(543);
        getinbank.addTransaction(654);
    }

    public int getBalanceOfMachines()
    {
        return santander.getbalance() + bnp.getbalance() + getinbank.getbalance();
    }





}
