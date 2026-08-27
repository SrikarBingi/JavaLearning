package com.wait;

public class T2 extends Thread{
	
	Object obj;
	
	T2(Object obj){
		this.obj=obj;
	}
	
	@Override
	public void run() {
		synchronized (obj) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("T2 started");
			System.out.println("T2 notifying T1...");
			obj.notify();
		}
	}
}
