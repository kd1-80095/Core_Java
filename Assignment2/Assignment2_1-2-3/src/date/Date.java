package date;
import java.util.Scanner;
public class Date {

	private int month;
	private int day;
	private int year;
	
	
	public Date() {
		this.month = 0;
		this.day = 0;
		this.year = 0;
	}


	public Date(int month, int day, int year) {
		
		this.month = month;
		this.day = day;
		this.year = year;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
    public void acceptdate()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Month:");
    	month=sc.nextInt();
    	System.out.println("Enter day:");
    	day=sc.nextInt();
    	System.out.println("Enter Year:");
    	year=sc.nextInt();
    }
    
    public void displaydate()
    {
    	System.out.println(month+"/"+day+"/"+year);
    	
    }
}
