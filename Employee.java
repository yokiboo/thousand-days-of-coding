package com.dailyPractice;

public class Employee {
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, String department, String gender) {
		this.name = name;
		this.age = age;
		this.department = department;
		this.gender = gender;
	}
	
	private String name;
	
	private int age;
	
	private String department;
	
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
