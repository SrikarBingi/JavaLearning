package com.paymentsystem;

public class Main {
	public static void main(String[] args) {
		Payment p1 = new CreditCardPayment();
		Payment p2 = new NetBankingPayment();
		Payment p3 = new UPIPayment();
		
		p1.pay(1000);
		p2.pay(500);
		p3.pay(2000);
	}
}
