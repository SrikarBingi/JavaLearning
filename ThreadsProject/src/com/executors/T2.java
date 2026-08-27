package com.executors;

public class T2 extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("Thread2...");
		}
	}
}
