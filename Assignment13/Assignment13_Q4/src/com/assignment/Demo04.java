package com.assignment;

import java.io.BufferedReader;
import java.io.FileReader;

public class Demo04 {

	public static void main(String[] args) {
		try(FileReader frd = new FileReader("file.txt") )
		{
			try(BufferedReader brd = new BufferedReader(frd) )
			{
				String line = brd.readLine();
				System.out.println(line);
			}
		}
		catch(Exception E) 
		{
			E.getStackTrace();
		}
	}

}
