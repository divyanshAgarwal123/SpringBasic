package com.springbasic.SpringBasic;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Listexample {
	List<String>phone;
	Set<String>address;
	Map<String,String>course;
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String,String> getCourse() {
		return course;
	}
	public void setCourse(Map<String,String> course) {
		this.course = course;
	}
	

}
