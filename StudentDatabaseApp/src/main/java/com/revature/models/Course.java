package com.revature.models;

public class Course {
	
	public static final double COST_OF_COURSE = 600.00; //class scope
	private String name;
	
	public Course(String name) {
		super();
		this.name = name;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Course [name=" + name + "]";
	}
	
	//getters & setters & tostring
	
	
}
