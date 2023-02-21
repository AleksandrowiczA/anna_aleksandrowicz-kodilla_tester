package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldCalculateBalanceOfallMachines() {
        Bank bank = new Bank();
        bank.addToBnp();
        bank.addToGetInBank();
        bank.addToSantander();
        bank.getBalanceOfMachines();
        assertEquals(853, bank.getBalanceOfMachines());
    }

}
