package com.Binod.CI_practice;

import java.util.Iterator;
import java.util.List;

public class InjectingList {
	private String id;
	private String name;
	private List<String> ls;
	InjectingList(String id, String name, List<String>ls){
		this.id=id;
		this.name=name;
		this.ls=ls;
	}
	
	public void Display() {
		System.out.println("the id is "+id);
		System.out.println("the name is "+name);
		Iterator<String> itr= ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	

}
