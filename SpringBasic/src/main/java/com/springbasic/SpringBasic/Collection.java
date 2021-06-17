package com.springbasic.SpringBasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Collection {
	public static void main(String args[]) 	
	{ 
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springbasic/SpringBasic/ByList.xml");
		Listexample Listexample = (Listexample)context.getBean("e");
		System.out.println(Listexample.getAddress());
		System.out.println(Listexample.getCourse());
		System.out.println(Listexample.getPhone());
	}
}
