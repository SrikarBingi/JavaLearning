package com.threads;

public class Test {
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		myThread1.start();
//		System.out.println("Main -->"+Thread.currentThread().getName());
		Test t = new Test();
		t.print();
		
		Runnable myThread2 = new MyThread2();
		Thread t2 = new Thread(myThread2);
		t2.start();
	}
	void print() {
		try {
			Thread.sleep(1);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		for(int i=0;i<=20;i++) {
			System.out.println("Bye...");
		}
	}
}
