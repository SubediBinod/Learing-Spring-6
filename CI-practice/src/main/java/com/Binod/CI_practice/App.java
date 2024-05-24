package com.Binod.CI_practice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("resources/spring.xml");
    	checkcheck ch = (checkcheck)context.getBean("bean1");
    	ch.doConfirm();
    	
    	//Constructor injecting a List
    	InjectingList ls= (InjectingList)context.getBean("bean2");
    	ls.Display();
    	
    	
    }
}
