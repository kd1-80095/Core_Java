/*
 3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option , display total bill & exit.
 */
import java.util.Scanner;
public class Assignment1_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int Dosa = 50;
    int Samosa = 20;
    int Idali =25;
    int Total1=0,Total2=0,Total3=0,Total=0;
    int qty=0;
    
    
    	while(true)
    	{ 
    		System.out.println("-----------\n"+"Menu Card:\n1.Dosa\n2.Samosa\n3.Idali\n10. Generate Bill\n0.Exit");
    		System.out.println("Enter Choice:");
    	    int choice = sc.nextInt();
    	    
    	  switch(choice)
    	  {
    	  case 0:
    	  {
    		  System.out.println("Thanks For Visiting");
    		  System.exit(0);
    	  }
    	  case 1:
    		  {
    			  System.out.println("Enter Quantity Of Dosa:");
    		   	  qty=sc.nextInt();
    		   	  Total=Total + (Dosa*qty);
    		  }
    		  break;
    	  case 2:
		  {
			  System.out.println("Enter Quantity Of Samosa:");
		   	  qty=sc.nextInt();
		   	  Total=Total+(Samosa*qty);
		  }
		  break;
    	  case 3:
		  {
			  System.out.println("Enter Quantity Of IDALI:");
		   	  qty=sc.nextInt();
		   	  Total=Total+(Idali*qty);
		  }
		  break;
    	  	  
    	  case 10:
		  {
			  System.out.println("Total Bill");
			  //Total=Total1+Total2+Total3;
		   	  System.out.println(Total);
		  }
		  break;	  
    	  }
    	}
		
	}
}
