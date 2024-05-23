package com.java.bankapp;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBankApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        System.out.println("...............Welcome To Bank Of Maharashtra..........");
        while (true) {
        	
            System.out.println("\nBanking Application Menu:");
            System.out.println("1. Create Account");
            System.out.println("2. Display All Accounts");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
            
                case 1:
                	scanner.nextLine();
                    System.out.print("Enter account holder name: ");
                    String accountHolder = scanner.nextLine();
                    
                    System.out.print("Enter account number: ");
                    int accountNumber = scanner.nextInt();
                    System.out.print("Enter initial balance: ");
                    double initialBalance = scanner.nextDouble();

                    System.out.print("Select account type (1 for Savings, 2 for Current): ");
                    int accountType = scanner.nextInt();
                    Account account;
                    if (accountType == 1) {
                        account = new SavingAccount(accountHolder, accountNumber, initialBalance);
                        System.out.println("Saving account created successfully..!");
                    } else {
                        account = new CurrentAccount(accountHolder, accountNumber, initialBalance);
                        System.out.println("Current account created successfully..!");

                    }
                    accounts.add(account);
                    break;

                case 2:
                    for (Account acc : accounts) {
                        acc.displayAccountDetails();
                    }
                    break;

                case 3:
                	  System.out.print("Enter account number: ");
                      int depositAccountNumber = scanner.nextInt();
                      System.out.print("Enter deposit amount: ");
                      double depositAmount = scanner.nextDouble();

                      Account depositAccount = findAccount(accounts, depositAccountNumber);
                      if (depositAccount != null) {
                          depositAccount.deposit(depositAmount);
                      } else {
                          System.out.println("Account not found.");
                      }
                      break;

                case 4:
                	 System.out.print("Enter account number: ");
                     int withdrawAccountNumber = scanner.nextInt();
                     System.out.print("Enter withdrawal amount: ");
                     double withdrawAmount = scanner.nextDouble();

                     Account withdrawAccount = findAccount(accounts, withdrawAccountNumber);
                     if (withdrawAccount != null) {
                         withdrawAccount.withdraw(withdrawAmount);
                     } else {
                         System.out.println("Account not found.");
                     }
                     break;
                case 5:
                    System.out.println("Exiting the application. Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

	}
	 private static Account findAccount(ArrayList<Account> accounts, int accountNumber) {
	        for (Account acc : accounts) {
	            if (acc.getAccountNumber() == accountNumber) {
	                return acc;
	            }
	        }
	        return null;
	    }

}
