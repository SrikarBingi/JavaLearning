package com.threads;

public class MyThread1 extends Thread{
	public void run() {
//		System.out.println("Hi");
//		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<=20;i++) {
			System.out.println("Thread 1...");
		}
	}
}
