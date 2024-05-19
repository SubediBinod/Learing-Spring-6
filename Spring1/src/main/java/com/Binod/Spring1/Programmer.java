package com.Binod.Spring1;

public class Programmer implements Human{
	public void doCode() {
		System.out.println("Starting to code");
		System.out.println("hey hey its working");
		
	}

	@Override
	public void doSleep() {
		System.out.println("now i am sleeping");
		
	}
}
