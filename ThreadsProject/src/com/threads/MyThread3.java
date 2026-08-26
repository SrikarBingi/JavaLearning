package com.threads;

public class MyThread3 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println("Thread3...");
		}
	}

}
