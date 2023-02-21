package com.kodilla.bank.homework;

public class CashMachine {

    private int[] cash;
    private int size;
    public CashMachine()
    {
        this.size = 0;
        this.cash = new int[0];
    }

    public int[] getValues() {
        return cash;
    }

    public void addTransaction(int amount)
    {
        size++;
        int[] newTab = new int[size];
        System.arraycopy(cash, 0, newTab, 0, cash.length);
        newTab[size - 1] = amount;
        cash = newTab;

    }

    public void checkTable()
    {
        for(int i = 0; i < cash.length; i++)
        {
            System.out.println(cash[i]);
        }
    }
    public int numberOfCashOut()
    {
        int numberOfTransactionsOut = 0;

        for(int i = 0; i < cash.length; i++)
        {
            if(cash[i] < 0)
            {
                numberOfTransactionsOut++;
            }
        }
        return numberOfTransactionsOut;
    }
    public double averageOfCashOut()
    {
        int numberOfTransactionsOut = 0;
        double sum = 0;

        for(int i = 0; i < cash.length; i++)
        {
            if(cash[i] < 0)
            {
                sum+= cash[i];
                numberOfTransactionsOut++;
            }
        }
        return sum/numberOfTransactionsOut;
    }
    public int numberOfCashIn()
    {
        int numberOfTransactionsIn = 0;

        for(int i = 0; i < cash.length; i++)
        {
            if(cash[i] > 0)
            {
                numberOfTransactionsIn++;
            }
        }
        return numberOfTransactionsIn;
    }
    public double averageOfCashIn()
    {
        int numberOfTransactionsIn = 0;
        double sum = 0;

        for(int i = 0; i < cash.length; i++)
        {
            if(cash[i] > 0)
            {
                sum+= cash[i];
                numberOfTransactionsIn++;
            }
        }
        return sum/numberOfTransactionsIn;
    }
    public int balance()
    {
        int sum = 0;
        for(int i = 0 ; i < cash.length ; i++)
        {
            sum += cash[i];
        }
        return sum;
    }

    public int getbalance()
    {
        return balance();
    }

    public int numberOfTransactions()
    {
        return cash.length;
    }
}
