package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    int balance;

    public Account(int initialBalance) {
        balance = initialBalance;
    }

    public int checkBalance() {
        return balance;
    }

    public boolean deposit(int amountToDeposit) {
        balance += amountToDeposit;
        return true;
    }

    public boolean withdraw(int amountToWithdraw) {
        if (balance >= amountToWithdraw) {
            balance -= amountToWithdraw;
            return true;
        }
        return false;
    }
}
