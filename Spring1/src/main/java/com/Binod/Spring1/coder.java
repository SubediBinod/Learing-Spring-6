package com.Binod.Spring1;

public class coder  {
    private int age;
    //one way to do it
    //private Human hum= new Programmer();
    private Human hum;
    //but we don't want to create an object we will let spring do it 

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("The setter method is being called");
        this.age = age;
    }
    

	/*
	 * public void setPro(Programmer pro) { this.pro = pro; }
	 */
	
	public Human getHum() {
		return hum;
	}

	public void setHum(Human hum) {
		this.hum = hum;
	}

	public void callProgrammer() {
//		pro.doCode();
		hum.doSleep();
	
	}
}
