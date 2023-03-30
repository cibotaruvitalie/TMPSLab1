package com.example.banking;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // create some accounts
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        CheckingAccount checkingAccount = new CheckingAccount(500);
        LoanAccount loanAccount = new LoanAccount(-500);

        // add the accounts to a list
        List<Account> accounts = new ArrayList<>();
        accounts.add(savingsAccount);
        accounts.add(checkingAccount);
        accounts.add(loanAccount);

        // create an AccountManager to manage the accounts
        AccountManager accountManager = new AccountManager(accounts);

        // deposit some money into the savings account
        accountManager.deposit(500, 0);

        // withdraw some money from the checking account
        accountManager.withdraw(200, 1);

        // print the balances of all the accounts
        for (int i = 0; i < accounts.size(); i++) {
            System.out.printf("Account %d balance: $%.2f\n", i, accountManager.getBalance(i));
        }
    }
}
