package com.example.banking;

import java.util.List;

public class AccountManager {
    private List<Account> accounts;

    public AccountManager(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void deposit(double amount, int accountIndex) {
        Account account = accounts.get(accountIndex);
        account.deposit(amount);
    }

    public void withdraw(double amount, int accountIndex) {
        Account account = accounts.get(accountIndex);
        account.withdraw(amount);
    }

    public double getBalance(int accountIndex) {
        Account account = accounts.get(accountIndex);
        return account.getBalance();
    }
}