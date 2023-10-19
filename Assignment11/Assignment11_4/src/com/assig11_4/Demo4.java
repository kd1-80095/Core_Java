package com.assig11_4;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
//Use TreeSet to store all books in descending order of price. Natural ordering for the Book should be isbn 
//(do not change it). Display them using iterator() and descendingIterator().
public class Demo4{
	
	static class BookPriceComparator implements Comparator<Book>
	{

		@Override
		public int compare(Book b1, Book b2) {
			int diff= -(Double.compare(b1.getPrice(), b2.getPrice()));
			return diff;
		}
		
	}

	public static void main(String[] args) {
		
		BookPriceComparator PriceComparator = new BookPriceComparator();
		TreeSet<Book> book= new TreeSet<>(PriceComparator);
		
		book.add(new Book("XJI",100.30,"Mangesh",20));
		book.add(new Book("PLO",50.20,"Ravindra",10));
		book.add(new Book("YTR",147.66,"Manas",15));
		book.add(new Book("PWQ",88.90,"Suresh",3));
		book.add(new Book("CTY",73.00,"Vishwas",44));
		book.add(new Book("CTY",73.00,"Kunal Bhatt",44));//duplicate
		
		Iterator<Book> itr= book.iterator();
		while(itr.hasNext())
		{
			Book b=itr.next();
			System.out.println(b);
		}
		System.out.println();
		System.out.println("After descendingIterator:");
		Iterator<Book>itr1 = book.descendingIterator();
		while(itr1.hasNext())
		{
			Book b=itr1.next();
			System.out.println(b);
		}
		
	
	}

}
