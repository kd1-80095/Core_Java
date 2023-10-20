package com.sunbeam;

public class Clerk implements Emp {
	private double salary;

	public Clerk() {
		
		this.salary = 0;
	}
	public Clerk(double salary) {
		
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public double getSal() {
		return this.salary;
		
	}
	
	
	
	

}
