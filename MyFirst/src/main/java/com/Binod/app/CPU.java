package com.Binod.app;

import org.springframework.stereotype.Component;

@Component
public class CPU {
	public void boot() {
		System.out.println("Loading OS into RAM");
	}
}
