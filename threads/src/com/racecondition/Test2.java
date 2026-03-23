package com.racecondition;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		Thread1 t1 = new Thread1(counter);
		Thread t2 = new Thread2(counter);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(counter.count);
		
	}
}
