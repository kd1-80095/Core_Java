package com.sunbeam;

public class Words {

	public static void main(String[] args) {
		String str = "What is your name";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 32)
				count++;
		}
		
		System.out.println(str);
		
		
		System.out.println(str.trim());
		
		System.out.println(count);
		
		String[] arr = str.split(" ", 0);
		for (String s : arr) {
			System.out.println(s);
		}
	}
}
