package com.springbasic.autowires;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class nameMain {

	public static void main(String[] args) {
		try
		{
			ApplicationContext context = new ClassPathXmlApplicationContext("nameAutowire.xml");
			C c1 = (C)context.getBean("d5");
			System.out.println(c1.toString());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
