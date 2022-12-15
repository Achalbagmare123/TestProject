package com.arraylistquestion1.labtest;

//Write a Java program to swap two elements in an array list

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElements {

	public static void main(String a[]) {

		// Create the Array List
		ArrayList<String> ArrList = new ArrayList<String>();

		// add the fruits name in Array List
		ArrList.add("Apple");
		ArrList.add("Mango");
		ArrList.add("Banana");
		ArrList.add("Pineapple");
		ArrList.add("Kiwi");

		// display Array List before swap
		System.out.println("Before Swap the ArrayList ");
		System.out.println(ArrList);

		// Swapping the fruits at 0 and 4 indices
		Collections.swap(ArrList, 0, 4);

		// display Array List after swap
		System.out.println("After Swap the ArrayList");
		System.out.println(ArrList);
	}
}
