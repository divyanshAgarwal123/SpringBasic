package com.springbasic.SpringBasic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App  { 	
	public static void main(String args[]) 	
	{ 	
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee = (Employee)context.getBean("e");
		ConstructEmployee construct = (ConstructEmployee)context.getBean("f");
		employee.hello();
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getDesgination());
		//System.out.println("toasting method is calling"+employee);
		System.out.println("By Construct method, the rollno is "+construct.getRollno());
		System.out.println("the country is "+construct.getCountry());
		System.out.println("the age is "+construct.getAge());
		

		 
	}
	
}

