package com.springbasic.autowires;

public class AnnotationExample {
	private int id;
	private String name;
	@Override
	public String toString() {
		return "AnotaionExample [id=" + id + ", name=" + name + "]";
	}
	public AnnotationExample() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AnnotationExample(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
}
