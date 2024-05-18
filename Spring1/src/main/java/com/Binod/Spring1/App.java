package com.Binod.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml"); //makesure to have spring bean xml config
    	Programmer obj= (Programmer) context.getBean("programmer");
//    	
//    	//mathi ko step le Container banaux 
//    	//steps::
//    		//pom.xml ma Spring context dependecny halne
//    		//ewta xml file banaune
//    		//spring xml beans config google bata liyerw paste garne
    	obj.doCode();
//    	
    	
    	// setter injection
    	// we use <property> tag in out xml file
//    	flow::
//    		1. create the object
//    		2.call the setter method
//    		3.Execute other parts
    	//make sure that the class is not declared private.
    	
    	// 1. injecting value
    	
    	coder obj1 = (coder) context.getBean("Coder");  
    	System.out.println("the age defined through the setter injectio is "+ obj1.getAge());
    	
    	
    	// 2. injecting reference
    	obj1.callProgrammer();
    	
    	
    	
    	//Constructor injection
    	
    	//Luffy obj2 = (Luffy)context.getBean("luffy");
 
    }
}

