package com.lock;

public class T1 extends Thread{
	
	Thread t2;
	
	public void run() {
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=1;i<=10;i++) {
			System.out.println("T1 Thread..");
		}
	}

}
