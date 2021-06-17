package com.springbasic.autowires;

public class D {
	private String name;
	//default constructor
	public D()
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
		return "D [name=" + name + "]";
	}
	//to string method
	public D(String name) {
		super();
		this.name = name;
		
	}
}
