package com.springbasic.autowires;
public class C {
	private D d2;
	//argument constructor
	public C(D d2) {
		super();
		this.d2 = d2;
	}
	//Default Constructor
	public C() {
		super();
	}
	
	{
		System.out.println("hello class C");
		
	}
	//toasting Method
	@Override
	public String toString() {
		return "C [d2=" + d2 + "]";
	}
	//Getter Setter
	public D getd2() {
		return d2;
	}
	public void setD2(D d2) {
		this.d2=d2;
	}
	
	
}
