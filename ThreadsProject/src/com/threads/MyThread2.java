package com.threads;

public class MyThread2 extends Thread{
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println("Thread2...");
		}
	}
}
