package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.model.Jio;
import com.model.Sim;

@Component
public class SimTest {
	
	@Autowired
	@Qualifier("jio")
	Sim sim;
	
	public void test() {
		sim.call();
	}
}
