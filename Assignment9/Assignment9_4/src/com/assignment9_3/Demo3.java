package com.assignment9_3;

import java.util.Arrays;
import java.util.Comparator;

public class Demo3 {

	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0] = new Student(1, "Atish","Sangli", 96.30);
		arr[1] = new Student(2, "Anil","Nanded", 70.80);
		arr[2] = new Student(3, "Manas","Pune", 66.58);
		arr[3] = new Student(4, "Prathamesh","Mumbai", 87.42);
		arr[4] = new Student(5, "Kunal","Delhi",69.25);
		
		System.out.println("Before Sort: ");
		for (Student e : arr)
			System.out.println(e);
		
		Arrays.sort(arr);
		
		System.out.println("After Sort: ");
		for (Student e : arr)
			System.out.println(e);
		
		class CityComparator implements Comparator<Student>
		{

		
			@Override
			public int compare(Student arg0, Student arg1) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		}

	}

}