package com.Binod.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
//this annotation must be there to let spring know that he has to
//create object for this class
public class Binod {
	void print() {
		System.out.println("hello world from Binod class");
	}
}

@Component
class Laptop{
	@Autowired
	CPU cpu;
	public void start() {
		cpu.boot();
	}
	
}
