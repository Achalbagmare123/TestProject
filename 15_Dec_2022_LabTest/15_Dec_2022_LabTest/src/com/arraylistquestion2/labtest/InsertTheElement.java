package com.arraylistquestion2.labtest;

//Write a Java program to insert an element into the array list at the first position

import java.util.ArrayList;

public class InsertTheElement {

	public static void main(String[] args) {
		// Create a list and add some fruits name to the list
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("Banana");
		arraylist.add("Grapes");
		arraylist.add("Orange");
		arraylist.add("Pineapple");
		arraylist.add("Strawberry");
		// Print the list
		System.out.println(arraylist);
		// Now insert a fruits name at the first position of the list
		arraylist.add(0, "Avocado");
		// Print the list
		System.out.println(arraylist);
	}
}
