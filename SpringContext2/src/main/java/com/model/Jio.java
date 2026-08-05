package com.model;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Sim{

	@Override
	public void call() {
		
		System.out.println("Jio is calling");
		
	}

}
