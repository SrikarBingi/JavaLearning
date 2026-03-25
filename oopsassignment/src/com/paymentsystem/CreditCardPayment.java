package com.paymentsystem;

public class CreditCardPayment implements Payment{
	@Override
    public void pay(double amount) {
        System.out.println("Payment Successful");
        System.out.println("Mode: Credit Card");
        System.out.println("Amount: " + amount);
        System.out.println("----------------------");
    }
}
