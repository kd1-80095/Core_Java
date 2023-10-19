package com.assignment9_2;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Arrays;



class Arraysorting implements Comparator<Double>
	{

	@Override
	public int compare(Double list1, Double list2) 
	{
		int diff=Double.compare(list1, list2);

		return diff;
	}

}

public class Demo2 {

static <T> void selectionSort(T[] arr, Comparator<T> c) {
	for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(c.compare(arr[i], arr[j]) > 0) {
				T temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
}


public static void main(String[] args) {

Double[] arr = { 48.52,96.10,3.20,4.56 };
System.out.println("Array Before Sort:");	
for(double e:arr)
	{
		System.out.println(e);
	}

	Arraysorting compare=new Arraysorting();

	selectionSort(arr,compare);

	System.out.println("Array After Sort:");
	for(double e:arr)
	{
		System.out.println(e);
	}

}





}