package com.java.bankapp;

public abstract class Account {
	 protected String accountHolder;
	    protected int accountNumber;
	    protected double balance;

	    public Account(String accountHolder, int accountNumber, double initialBalance) {
	        this.accountHolder = accountHolder;
	        this.accountNumber = accountNumber;
	        this.balance = initialBalance;
	    }
	    

	    public int getAccountNumber() {
			return accountNumber;
		}


		public abstract void displayAccountDetails();

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposit successful. New balance: $" + balance);
	    }

	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrawal successful. New balance: $" + balance);
	        } else {
	            System.out.println("Insufficient funds.");
	        }
	    }
	
}
