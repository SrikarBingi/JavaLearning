package com.paymentsystem;

public class UPIPayment implements Payment{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment Successful");
        System.out.println("Mode: UPI");
        System.out.println("Amount: " + amount);
        System.out.println("----------------------");
	}

}
