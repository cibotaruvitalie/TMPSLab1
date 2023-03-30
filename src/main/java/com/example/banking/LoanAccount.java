package com.example.banking;

public class LoanAccount implements Account {
    private double balance;

    public LoanAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        throw new UnsupportedOperationException("Cannot deposit into loan account");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }
}