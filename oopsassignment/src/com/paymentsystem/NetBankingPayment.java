package com.paymentsystem;

public class NetBankingPayment implements Payment{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment Successful");
        System.out.println("Mode: Net Banking");
        System.out.println("Amount: " + amount);
        System.out.println("----------------------");
	}

}
