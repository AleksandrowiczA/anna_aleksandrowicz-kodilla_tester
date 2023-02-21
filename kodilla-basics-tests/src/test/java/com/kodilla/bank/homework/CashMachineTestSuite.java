package com.kodilla.bank.homework;

import com.kodilla.school.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite
{
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] cash = cashMachine.getValues();
        assertEquals(0, cash.length);
    }

    @Test
    public void shouldAddFourElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(1000);
        cashMachine.addTransaction(2000);
        cashMachine.addTransaction(-1500);
        cashMachine.addTransaction(-300);

        int[] cash = cashMachine.getValues();
        assertEquals(4, cash.length);
        assertEquals(1000, cash[0]);
        assertEquals(2000, cash[1]);
        assertEquals(-1500, cash[2]);
        assertEquals(-300, cash[3]);
    }
    @Test
    public void shouldCheckNumberOfCashOutTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(1000);
        cashMachine.addTransaction(2000);
        cashMachine.addTransaction(-1500);
        cashMachine.addTransaction(-300);
        cashMachine.addTransaction(-1700);

        assertEquals(3, cashMachine.numberOfCashOut());
    }
    @Test
    public void shouldCalculateAverageOfCashOutTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(1300);
        cashMachine.addTransaction(-250);
        cashMachine.addTransaction(-1500);
        cashMachine.addTransaction(-3600);
        cashMachine.addTransaction(-1700);

        assertEquals(-1762.5, cashMachine.averageOfCashOut(), 0.1);
    }

    @Test
    public void shouldCheckNumberOfCashInTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(1000);
        cashMachine.addTransaction(2000);
        cashMachine.addTransaction(-1500);
        cashMachine.addTransaction(1700);
        cashMachine.addTransaction(500);

        assertEquals(4, cashMachine.numberOfCashIn());
    }
    @Test
    public void shouldCalculateAverageOfCashInTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(1300);
        cashMachine.addTransaction(2500);
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(-3600);
        cashMachine.addTransaction(-1700);

        assertEquals(1366.6, cashMachine.averageOfCashIn(), 0.1);
    }
    @Test
    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.averageOfCashIn(), 0.1);
    }
    @Test
    public void shouldCalculateBalance(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(1300);
        cashMachine.addTransaction(2500);
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(-3600);
        cashMachine.addTransaction(-1700);

        assertEquals(-1200, cashMachine.balance(), 0.1);

    }
}
