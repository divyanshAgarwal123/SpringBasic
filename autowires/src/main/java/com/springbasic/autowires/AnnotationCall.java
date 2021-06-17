package com.springbasic.autowires;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AnnotationCall {
	@Autowired 
	@Qualifier("divyansh")
	private AnnotationExample anotation;

	public AnnotationExample getAnotation() {
		return anotation;
	}
	public void setAnotation(AnnotationExample anotation) {
		this.anotation = anotation;
	}

	public AnnotationCall() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AnnotationCall [anotation=" + anotation + "]";
	}

	public AnnotationCall(AnnotationExample anotation) {
		super();
		this.anotation = anotation;
		System.out.println("calling");
	}

	
}
