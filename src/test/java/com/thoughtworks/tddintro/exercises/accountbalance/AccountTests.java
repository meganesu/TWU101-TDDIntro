package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTests {
    @Test
    //@Ignore  // Remove each @Ignore and implement test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        int initialBalance = 100;
        int amountToDeposit = 50;
        Account account = new Account(initialBalance);
        boolean result = account.deposit(amountToDeposit);
        int newBalance = account.checkBalance();
        assertTrue(result);
        assertEquals(initialBalance + amountToDeposit, newBalance);
    }

    @Test
    //@Ignore  // Remove each @Ignore and implement test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        int initialBalance = 100;
        int amountToWithdraw = 50;
        Account account = new Account(initialBalance);
        boolean result = account.withdraw(amountToWithdraw);
        int newBalance = account.checkBalance();
        assertTrue(result);
        assertEquals(initialBalance - amountToWithdraw, newBalance);
    }

    @Test
    //@Ignore  // Remove each @Ignore and implement test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        // 50 - 100 = 50
        int initialBalance = 50;
        int amountToWithdraw = 100;
        Account account = new Account(initialBalance);
        boolean result = account.withdraw(amountToWithdraw);
        int newBalance = account.checkBalance();
        assertFalse(result);
        assertEquals(initialBalance, newBalance);
    }
}
