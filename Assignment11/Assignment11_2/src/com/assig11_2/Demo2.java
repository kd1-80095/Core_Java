package com.assig11_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//In above assignment use LinkedHashSet instead of HashSet. 
//If any book with duplicate isbn is added, what will happen? Books are stored in which order?

public class Demo2{

	public static void main(String[] args) {
		
		Set<Book> book = new LinkedHashSet<>();
		book.add(new Book("XJI",100.30,"Mangesh",20));
		book.add(new Book("PLO",50.20,"Ravindra",10));
		book.add(new Book("YTR",147.66,"Manas",15));
		book.add(new Book("PWQ",88.90,"Suresh",3));
		book.add(new Book("CTY",73.00,"Vishwas",44));
		book.add(new Book("CTY",73.00,"Vishwas",44));//duplicate
		Iterator<Book> itr= book.iterator();
		while(itr.hasNext())
		{
			Book b1= itr.next();
			System.out.println(b1);
		}
		
		
	
	}

}
