package com.wintal.junit.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeJUnitTest {
	
	@Test
	public void testSalary(){
		EmployeeDetails details = new EmployeeDetails("Rahul", 25, 1000);
		EmployeeBusinessLogic businessLogic =  new EmployeeBusinessLogic();
		assertEquals(12000, businessLogic.annualSalary(details),0.0);
		
	}
	
	@Test
	public void checkIncrement(){
		EmployeeDetails details = new EmployeeDetails("Rahul", 25, 1000);
		EmployeeBusinessLogic businessLogic =  new EmployeeBusinessLogic();
		assertEquals(500, 500, 0.0);
	}

}
