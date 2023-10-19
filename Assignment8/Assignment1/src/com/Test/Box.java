package com.Test;
import com.assignment.Employee;

public class Box <T extends Employee>{

	private T obj;
	
	public void setData(T obj)
	{
	  this.obj=obj;	
	}
	
	public T getData()
	{
	 return this.obj;	
	}
	public double getTotalSalary()
	{
		return obj.calcTotalSalary();
	}
}
