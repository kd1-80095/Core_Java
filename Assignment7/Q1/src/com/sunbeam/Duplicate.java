package com.sunbeam;

/*Q1. Declare two Arrays of type String. Find the duplicate values of an array of string values. (Hint:
use equals())*/
public class Duplicate {

	public static void main(String[] args) {
		String[] str1 = { "Tree", "Car", "House", "School", "Stand" };

		String[] str2 = new String[5];
		str2[0] = "Tree";
		str2[1] = "Stadium";
		str2[2] = "School";
		str2[3] = "Stand";
		str2[4] = "Hotel";
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				if (str1[i].equals(str2[j]))
					System.out.println(str1[i]);
			}
		}

	}

}
