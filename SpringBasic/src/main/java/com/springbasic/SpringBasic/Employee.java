package com.springbasic.SpringBasic;

public class Employee {		//modal class
	 private int id;
	 String name;
	 String desgination;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desgination=" + desgination + "]"; //toasting method
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesgination() {
		return desgination;
	}
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	public Employee(int id, String name, String desgination) {
		super();
		this.id = id;
		this.name = name;
		this.desgination = desgination;
	}
	public Employee() {
		super();
		System.out.println("objects are created"); 
	}
	void hello(){
		System.out.println("id is "+id+" name is "+name+" desgination is "+desgination);
		
	}
	
}
