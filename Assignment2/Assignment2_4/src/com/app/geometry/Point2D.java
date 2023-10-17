package com.app.geometry;
import java.util.Scanner;
import java.lang.Math;
public class Point2D {

	private double x;
	private double y;

	

	public Point2D() {
		this.x = 0;
		this.y = 0;
	}

	public Point2D(double x, double y) {
		
		this.x = x;
		this.y = y;
	}
	
	public void acceptPoint()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X axis Point:");
		this.x=sc.nextDouble();
		System.out.println("Enter Y axis Point:");
		this.y=sc.nextDouble();
	}
	
	public double distance(Point2D other )
	{
		double disX=this.x - other.x;
		double disY=this.y - other.y;
		return Math.sqrt(Math.pow(disX, 2)+Math.pow(disY, 2));
	}
	
	public String getDeatils()
	{
	return "(" + x + ", " + y + ")";	
	}
	
	public boolean equal(Point2D other)
	{
	return this.x==other.x && this.y==other.y;	
	}
	
	

}
