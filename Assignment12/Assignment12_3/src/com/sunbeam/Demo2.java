package com.sunbeam;
import java.util.Scanner;
public class Demo2 {
	static void calculate(double num1, double num2, Arithmetic op)
	{
		
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
	}
	
	static int menu()
	{
		 
		int choice;
		System.out.println("------------------");
		System.out.println("Choice:");
		System.out.println("1:Addition");
		System.out.println("2.Substraction");
		System.out.println("3:Multiplication");
		System.out.println("4:Division");
		System.out.println("Enter choice:");
		
		choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static void main(String[] args) {
		double num1,num2;
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			choice=menu();
			switch(choice)
			{
			case 1:  //addition
			{
				System.out.println("Enter Two Numbers:");
				num1=sc.nextDouble();
				num2=sc.nextDouble();
	
			System.out.println("Addition is");
			 calculate(num1,num2,(a,b)-> (a+b));
			}
			break;
			
			case 2:
			{
				System.out.println("Enter Two Numbers:");
				num1=sc.nextDouble();
				num2=sc.nextDouble();

				System.out.println("Substraction is");
				calculate(num1,num2,(a,b) -> a-b);
			}
			break;
			
			case 3:
			{  
				System.out.println("Enter Two Numbers:");
				num1=sc.nextDouble();
				num2=sc.nextDouble();

				System.out.println("Multiplication is");
				calculate(num1,num2,(a,b) -> a*b);
			}
			break;
			
			case 4:
			{
				System.out.println("Enter Two Numbers:");
				num1=sc.nextDouble();
				num2=sc.nextDouble();

				System.out.println("Division is");
				calculate(num1,num2,(a,b) -> a/b);
			}
			break;
			
			}
			
		}while(choice!=0);
	}

}
