package com.lock;

public class T2 extends Thread{
	
	Thread t1;
	
	public void run() {
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=1;i<=10;i++) {
			System.out.println("T2 Thread..");
		}
	}
	
}
