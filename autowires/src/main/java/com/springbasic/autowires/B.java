package com.springbasic.autowires;

public class B {
	private String name;
	//default constructor
	public B()
	{
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "B [name=" + name + "]";
	}
	//to string method
	public B(String name) {
		super();
		this.name = name;
		
	}
}
