package com.assignment;

import java.util.Scanner;

public class Manager extends Employee{
		private double bonus;
		private String designation;

		public Manager() {
	        this.designation = "Manager";
	        this.bonus = 0;
	    }
		
		public Manager(int id, double sal,double bonus,String designation) {
			super(id, sal);
			 this.designation = designation;
		      this.bonus = bonus;
		}

		public void accept()
	    {
			super.accept();
	        System.out.println("Enter bonus : ");
	        this.bonus= new Scanner(System.in).nextFloat();
	    }
		public void display()
	    {
			super.display();
	        System.out.println("----------------------");
			super.display();
	        System.out.println(" Bonus : "+this.bonus);
	    }
		public double getBonus()
	    {
	        return this.bonus;
	    }
		public void setBonus(float bonus)
	    {
	        this.bonus = bonus;
	    }
		@Override
		public double calcTotalSalary() {
			return (super.getSal()+this.getBonus());
		}
}