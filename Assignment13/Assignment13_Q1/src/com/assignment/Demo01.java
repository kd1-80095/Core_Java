package com.assignment;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.stream.FileImageInputStream;

import java.util.Comparator;
import java.util.ListIterator;
import java.util.Objects;
import java.io.DataInputStream;
import java.io.DataInputStream;

		public class Demo01 {

		static int menu() {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("0. Exit");
		        System.out.println("1. Add new book in List");
		        System.out.println("2. Display all books in forward order using random access");
		        System.out.println("3. Search a book with given isbn");
		        System.out.println("4. Delete a book at given index");
		        System.out.println("5. Delete a book with given isbn");
		        System.out.println("6. Reverse the list");
		        System.out.println("7. Save book in file");
		        System.out.println("8. Load books from file");
		        System.out.print("Enter your choice: ");
		        System.out.println("---------------------------");
		        return sc.nextInt();
		    }
		    public static void main(String[] args) {
		        ArrayList<Book> list = new ArrayList<Book>();
		        int choice,index;
		        Scanner sc = new Scanner(System.in);
		       // Book b;
		        do {
		            choice = menu();
		            switch (choice) {
		            case 0:
		                System.out.println("Exit the program.");
		                break;
		               
		                case 1: //add book
		                {
		                	System.out.println("Enter book Details");
		                    Book b = new Book();
		                    b.acceptDetails();
		                    
		                    if(list.contains(b))
		                    {
		                    	index=list.indexOf(b);
		                    	Book bk=list.get(index);
		                    	
		                    	bk.setQuantity(bk.getQuantity()+b.getQuantity());
		                    	System.out.println("Incremented");
		                    }
		                    else
		                    {
		                    	list.add(b);
		                    	System.out.println("Book Added:");
		                    }
		                    
		                }    
		                    break;
		                case 2:
		                	System.out.println("Book List: ");
		                	ListIterator<Book>itr = list.listIterator();
		    				while(itr.hasNext()) {
		    					Book b = itr.next();
		    					System.out.println(b);
		    				}
		    				break;
		                
		                case 3:
		                {
		                	System.out.println("Enter ISBN number:");
		                    String isbn=sc.next();
		    				Book key = new Book();
		    				key.setIsbn(isbn);
		    				index = list.indexOf(key);
		    				if(index == -1)
		    					System.out.println("Book not found.");
		    				else {
		    					System.out.println("book Found at Index: " + index);
		    					Book b = list.get(index);
		    					System.out.println(b);
		    				}
		                }
		                break;
		                case 4:
		                {
		                	System.out.println("Enter Index To delete Book:");
		                	index=sc.nextInt();
		     				list.remove(index);
		     				System.out.println("Book At Index "+index+"deleted");
		                }	
		                break;
		                case 5:
		                {
		                	System.out.println("Enter ISBN number:");
		                    String isbn=sc.next();
		    				Book key = new Book();
		    				key.setIsbn(isbn);
		    				index = list.indexOf(key);
		    				if(index == -1)
		    					System.out.println("Book not found.");
		    				else {
		    					list.remove(index);
		         				System.out.println("Book At Index "+index+"deleted");
		    				}
		    					
		                }
		                break;
		                case 6:
		                {
		                	System.out.println();
		                }
		                break;
		                case 7:
		                {
		                	try(FileOutputStream fout = new FileOutputStream("Book.txt")) 
		                	{
		                		try(DataOutputStream dout = new DataOutputStream(fout))
		                		{
		                			for (Book b :list)
		                			{
		                				dout.writeUTF(b.getIsbn());
		                				dout.writeDouble(b.getPrice());
		                				dout.writeUTF(b.getAuthorName());
		                				dout.writeInt(b.getQuantity());
		                			}
		                		}
		                	}
		                	catch (Exception e)
		                	{
		                		e.getStackTrace();
		                	}
		                System.out.println("Books Saved:");
		                }
		                break;
		                
		                case 8:
		                {
		                	try (FileInputStream fin = new FileInputStream("Book.txt"))
		                	{
		                		try(DataInputStream din =new DataInputStream(fin))
		                		{
		                			while (true)
		                			{
		                				Book b = new Book();
		                				b.setIsbn(din.readUTF());
		                				b.setPrice(din.readDouble());
		                				b.setAuthorName(din.readUTF());
		                				b.setQuantity(din.readInt());
		                				System.out.println(b);
		                			}
		                		}
		                		
		                	}
		                	catch (Exception e)
		                	{
		                		
		                	}
		                }
		                break;
		                
		                
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		                break;
		            }
		        } while (choice != 0);
		    }
		



	

}
