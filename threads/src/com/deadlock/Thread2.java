package com.deadlock;

public class Thread2 extends Thread{
	Thread1 t1;
	public void run() {
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<=20;i++) {
			System.out.println("Thread2 -->");
		}
	}
}
