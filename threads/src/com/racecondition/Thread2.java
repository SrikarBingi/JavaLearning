package com.racecondition;

public class Thread2 extends Thread{
	Counter c;
	public Thread2(Counter c){
		this.c = c;
	}
	public void run() {
		for(int i=1;i<=2000;i++) {
			c.increment();
		}
	}
}
