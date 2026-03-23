package com.threads;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++) {
			System.out.println("Thread 2 -->");
		}
	}
	
}
