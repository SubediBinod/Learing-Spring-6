package com.Binod.Spring1;

public class coder {
    private int age;
    private Programmer pro;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("The setter method is being called");
        this.age = age;
    }

    
	public void setPro(Programmer pro) {
		this.pro = pro;
	}

	public void callProgrammer() {
		pro.doCode();
	}
}
