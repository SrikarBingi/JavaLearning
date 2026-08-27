package com.wait;

public class MainThread {
	
	public static void main(String[] args) {
		
		Object obj = new Object();
		
		T1 t1 = new T1(obj);
		T2 t2 = new T2(obj);
		
		t1.start();
		t2.start();
		
		System.out.println("Main thread running");
	}
}
