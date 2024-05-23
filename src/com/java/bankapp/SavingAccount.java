package com.java.bankapp;

public class SavingAccount extends Account{

	public SavingAccount(String accountHolder, int accountNumber, double initialBalance) {
        super(accountHolder, accountNumber, initialBalance);
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Holder: " + super.accountHolder);
        System.out.println("Account Number: " + super.accountNumber);
        System.out.println("Balance: $" + super.balance);
    }
}
