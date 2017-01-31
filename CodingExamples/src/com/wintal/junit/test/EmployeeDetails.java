package com.wintal.junit.test;

public class EmployeeDetails {
	
	private String name;
	private int age;
	private double monthlySalary;
	
	public EmployeeDetails(String name, int age, double salary ) {
		this.name = name;
		this.age = age;
		this.monthlySalary = salary;
	}
	
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
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	

}
