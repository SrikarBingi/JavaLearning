package com.threads;

public class TestThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		Counter counterObj = new Counter();
		
		Thread1 t1 = new Thread1(counterObj);
		t1.start();
		
		Thread1 t2 = new Thread1(counterObj);
		t2.start();
		
		t1.join();
		t2.join();
		
		
		System.out.println(counterObj.count);
		
	}
}
class Thread1 extends Thread{
	
	Counter c;
	
	Thread1(Counter c){
		this.c=c;
	}
	
	public void run() {
		for(int i=1;i<=1000;i++) {
			c.increment();
		}
	}
}
class Thread2 extends Thread{
	
	Counter c;
	
	Thread2(Counter c){
		this.c=c;
	}
	
	public void run() {
		for(int i=1;i<=1000;i++) {
			c.increment();
		}
	}
}
