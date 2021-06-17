package com.springbasic.autowires;
public class A {
	private B b2;
	//argument constructor
	public A(B b2) {
		super();
		this.b2 = b2;
	}
	//Default Constructor
	public A() {
		super();
	}
	
	{
		System.out.println("hello class A");
		
	}
	//toasting Method
	@Override
	public String toString() {
		return "A [b2=" + b2 + "]";
	}
	//Getter Setter
	public B getb3() {
		return b2;
	}
	public void setB2(B b2) {
		this.b2=b2;
	}
	
	
}
