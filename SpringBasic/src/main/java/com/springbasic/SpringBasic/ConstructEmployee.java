package com.springbasic.SpringBasic;

public class ConstructEmployee {
	int rollno;
	String country;
	int age;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public ConstructEmployee(int rollno, String country, int age) {
		super();
		this.rollno = rollno;
		this.country = country;
		this.age = age;
	}

}
