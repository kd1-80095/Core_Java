import java.util.Scanner;
public class Assignment1_4a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows:");
		int rows=sc.nextInt();		
for (int i = 1; i <= rows; i++)
{

    for (int j = 1; j <= rows-i; j++)
    	{
        	System.out.print(" ");
    	}


    for (int j = i; j < 2*i; j++)
    	{
    		System.out.print("*"+" ");
    	}

    	System.out.println();
		}
	}

}
