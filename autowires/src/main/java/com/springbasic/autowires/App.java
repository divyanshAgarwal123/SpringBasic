package com.springbasic.autowires;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String args[]) 	
	{
		try
		{
			ApplicationContext context = new ClassPathXmlApplicationContext("typeAutowire.xml");
			A a1 = (A)context.getBean("b5");
			System.out.println(a1.toString());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
