
/*
 Q1. Accept a integer number and when the program is executed print the binary, octal and
hexadecimal equivalent of the given number.
Sample Output:
java Test
Enter Number : 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
Hint : Use Wrapper Class (toBinaryString() , toOctalString(), toHexString())
 */
import java.util.Scanner;
public class Assignment1_1 {

	public static void main(String[] args) {
	System.out.println("Enter number to check :");
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	Integer I1;
	I1=Integer.valueOf(num1);
	System.out.println("Given Number:"+I1);
	System.out.println("Binary Equivalent:"+I1.toBinaryString(num1));
	System.out.println("Octal Equivalent :"+I1.toOctalString(num1));
	System.out.println("Hexadecimal Equivalent :"+I1.toHexString(num1));	
	

	}

}
