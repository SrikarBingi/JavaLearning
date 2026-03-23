package com.bankaccountsystem;

public class BankAccount {
	
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	public BankAccount(int accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if (amount <= 0) {
	        System.out.println("Invalid deposit amount");
	        return;
	    }
		balance += amount;
		System.out.println(amount + " deposited successfully");
	}
	
	public void withdraw(double amount) {
		if (amount <= 0) {
	        System.out.println("Invalid amount");
	        return;
	    }

	    if (balance < amount) {
	        System.out.println("Insufficient balance");
	        return;
	    }

	    balance -= amount;
	    System.out.println(amount + " withdrawn successfully");
	}
	
	public double checkBalance() {
		return balance;
	}
	public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("---------------------------");
    }
}
