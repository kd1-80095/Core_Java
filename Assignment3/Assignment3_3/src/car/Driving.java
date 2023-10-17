/*
 Create an application that calculates your daily driving cost, so that you can estimate how much
money could be saved by car pooling, which also has other advantages such as reducing carbon
emissions and reducing traffic congestion. The application should input the following information
and display the user’s cost per day of driving to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day.
 */
package car;
import java.util.Scanner;

class drivingDetails
{
	private double miles;
	private double cost;
	private double average_miles;
	private double parking_fee;
	private double toll;

	
	public drivingDetails() {
		this.miles = 0;
		this.cost = 0;
		this.average_miles = 0;
		this.parking_fee = 0;
		this.toll =0;	
	}


	public drivingDetails(double miles, double cost, double average_miles, double parking_fee, double toll) {
		this.miles = miles;
		this.cost = cost;
		this.average_miles = average_miles;
		this.parking_fee = parking_fee;
		this.toll = toll;
	}


	public double getMiles() {
		return miles;
	}


	public void setMiles(double miles) {
		this.miles = miles;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public double getAverage_miles() {
		return average_miles;
	}


	public void setAverage_miles(double average_miles) {
		this.average_miles = average_miles;
	}


	public double getParking_fee() {
		return parking_fee;
	}


	public void setParking_fee(double parking_fee) {
		this.parking_fee = parking_fee;
	}


	public double getToll() {
		return toll;
	}


	public void setToll(double toll) {
		this.toll = toll;
	}
	
	public void acceptdetails()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Total miles driven per day:");
		this.miles = sc.nextDouble();
		System.out.println("Cost per gallon of gasoline:");
		this.cost = sc.nextDouble();
		System.out.println("Average miles per gallon:");
		this.average_miles = sc.nextDouble();
		System.out.println("Parking fees per day:");
		this.parking_fee = sc.nextDouble();
		System.out.println("Tolls per day:");
		this.toll =sc.nextDouble();
	}
	
	public void displaydetails()
	{
		System.out.println("---------------------------------");
		System.out.println("Total miles driven per day:"+miles);
		System.out.println("Cost per gallon of gasoline:"+cost);
		System.out.println("Average miles per gallon:"+average_miles);	
		System.out.println("Parking fees per day:"+parking_fee);
		System.out.println("Tolls per day:"+toll);
	}
	
	public double cost()
	{
		return (((getMiles()/getAverage_miles())*getCost())+getParking_fee()+getToll());
		//System.out.println(((miles/average_miles)*cost)+parking_fee+toll);
	}
};
	
	
public class Driving {

	public static void main(String[] args) {
		
		drivingDetails d1 = new drivingDetails();
		d1.acceptdetails();
		d1.displaydetails();
		System.out.println("Daily Driving Cost:"+d1.cost());
	}

}
