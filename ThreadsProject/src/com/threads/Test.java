package com.threads;

public class Test {
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		myThread1.start();
		
		MyThread2 myThread2 = new MyThread2();
		myThread2.start();
		
		MyThread3 myThread3 = new MyThread3();
		myThread3.run();
		
//		System.out.println("--> "+Thread.currentThread().getName());
	}
}
