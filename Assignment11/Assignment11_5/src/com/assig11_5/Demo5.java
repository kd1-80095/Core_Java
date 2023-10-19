package com.assig11_5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
//Store Books in HashMap<> so that for given isbn, book can be searched in fastest possible time. Do we need to write equals() and hashCode() 
//in Bookclass
public class Demo5{
	
    static int menu()
    {
    	Scanner sc = new Scanner(System.in);
    
    	int choice;
    	System.out.println("----------------");
    	System.out.println("CHOICES");
    	System.out.println("0 : EXIT");
    	System.out.println("1:Insert in map");
    	System.out.println("2:Find in map");
    	System.out.println("Enter Choice:");
    	
    	choice=sc.nextInt();
    	return choice;
    }
	
	public static void main(String[] args) {
		Map<String,Book> map= new HashMap<>(); 
		int choice;
		do {
            choice = menu();
            switch (choice) 
            {
            case 0:
            {
            	System.out.println("Exit");
            }
            break;
            
            case 1:
            {
            	Book b = new Book();
            	// accept book from user
            	map.put(b.getIsbn(), b);
            }
            break;
            
            case 2:
            {
            	Scanner sc=new Scanner(System.in);
            	System.out.println("Enter isbn:");
            	String isbn = sc.next();
            	Book f = map.get(isbn);
            }
            break;
            }
            
		
	      }while(choice!=0);
	}
}
