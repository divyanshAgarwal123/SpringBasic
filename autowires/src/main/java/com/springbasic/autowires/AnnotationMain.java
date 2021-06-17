package com.springbasic.autowires;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowiredExample2.xml");
		AnnotationCall a1 = (AnnotationCall)context.getBean("d5",AnnotationCall.class);
		System.out.println(a1.toString());
	}

}
