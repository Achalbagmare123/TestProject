package org.view;
import java.util.Scanner;

import org.service.question1.ArrayService;

public class Main {

	public static void main(String[] args) {
		int [] num=new int [5];
		ArrayService arrays=new ArrayService();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 5 number");
		for(int i=0;i<5;i++) {
        num[i]=sc.nextInt();
		}
		int average=arrays.calculateAverage(num);
		System.out.println("Average of the given array is "+average);

	}
	
	

}