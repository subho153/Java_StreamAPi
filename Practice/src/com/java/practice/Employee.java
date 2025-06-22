package com.java.practice;

import java.util.Arrays;
import java.util.List;

public class Employee {
	private int empId;
	private String empName;
	private double empsalary;
	
	Employee(int empId,String empName,double empsalary){
		this.empId=empId;
		this.empName=empName;
		this.empsalary=empsalary;
	}
public static void main(String[] args) {
	List<Employee> employeeList=Arrays.asList(new Employee(101, "Subho Ghosh", 2000.0),
											 (new Employee(102, "Ajay", 300.00)));
	
}
}
