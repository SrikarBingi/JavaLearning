package com.deadlock;

public class Thread1 extends Thread{
	Thread2 t2;
	public void run() {
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<=20;i++) {
			System.out.println("Thread1 -->");
		}
	}
}
