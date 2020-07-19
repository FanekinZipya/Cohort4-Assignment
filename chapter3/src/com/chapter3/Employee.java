package com.chapter3;

public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}

	public Employee() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		if(monthlySalary < 0) {
			this.monthlySalary = 0.0;
//			System.out.println("Input positive number");
		}else {
			this.monthlySalary = monthlySalary;
		}
		
	}
	
	public double yearlySalary() {
		double yearlySalary = monthlySalary * 12;
		return yearlySalary;
	}
	
}
