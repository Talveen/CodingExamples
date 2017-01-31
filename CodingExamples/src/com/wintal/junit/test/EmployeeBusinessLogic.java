package com.wintal.junit.test;

public class EmployeeBusinessLogic {
	
	public double annualSalary(EmployeeDetails details){
		return details.getMonthlySalary()*12;
	}
	
	public double addIncrement(EmployeeDetails details){
		if (details.getAge()>25)
			return 1000;
		else 
			return 500;
	}

}
