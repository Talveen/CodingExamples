package com.wintal.junit.test;

public class EmployeeBusinessLogic {
	
	public double annualSalary(EmployeeDetails details){
		return details.getMonthlySalary()*12;
	}

}
