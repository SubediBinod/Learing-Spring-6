package com.Binod.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml"); //makesure to have spring bean xml config
    	Programmer obj= (Programmer) context.getBean("programmer");
    	
    	//mathi ko step le Container banaux 
    	//steps::
    		//pom.xml ma Spring context dependecny halne
    		//ewta xml file banaune
    		//spring xml beans config google bata liyerw paste garne
    	obj.doCode();
    }
}

