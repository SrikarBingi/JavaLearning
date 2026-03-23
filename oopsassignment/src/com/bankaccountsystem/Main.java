package com.bankaccountsystem;

public class Main {
	public static void main(String[] args) {

        // 1. Create two bank accounts
        BankAccount acc1 = new BankAccount(101, "Srikar", 5000);
        BankAccount acc2 = new BankAccount(102, "Ravi", 3000);

        // 2. Deposit operations
        acc1.deposit(2000);
        acc2.deposit(1500);

        // 3. Withdrawal operations
        acc1.withdraw(1000);
        acc2.withdraw(5000); // should show insufficient balance

        // 4. Display final balance
        System.out.println("\nFinal Account Details:");
        acc1.displayDetails();
        acc2.displayDetails();
    }
}
