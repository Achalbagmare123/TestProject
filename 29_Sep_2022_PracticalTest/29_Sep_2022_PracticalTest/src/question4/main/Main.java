package question4.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import question4.model.Product;

public class Main {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		     Product product=new Product();
		  
			  System.out.println("Product Id ");
			  System.out.println("Enter 1 for product id: ");
			  int productId=scanner.nextInt();
			  scanner.nextLine();
			  System.out.println(" 123DE ");
			  scanner.nextLine();
			  
			  System.out.println("Product Price ");
			  System.out.println("product price are 100,67,168,78,145 ");
			  System.out.println("Enter 1 for the higher and lower prices ");
			  int productPrice=scanner.nextInt();
			  scanner.nextLine();
		        List<Integer> integerlist = Arrays.asList(100,67, 168,78,145);
		        System.out.print("Display the product with higher price : ");
		        Integer list = integerlist.stream().max(Integer::compare).get();
		        System.out.print(list);
		        scanner.nextLine();
		   
	           List<Integer> integerlist1 = Arrays.asList(100,67, 168,78,145);
	           System.out.print("Display the product with lowest price : ");
               Integer list1 = integerlist1.stream().min(Integer::compare).get();
               System.out.println(list1);
               scanner.nextLine();
               
               System.out.println("Product name ");
               System.out.println("Enter 1 for product names: ");
 			   String productName=scanner.nextLine();
 			   System.out.println("Product names are :");
 			   System.out.println("Sony, Dell,Mobil, Subway,Swissair");
 	     	   scanner.nextLine();
               System.out.print("Display the product whose name starts with 'S' : ");
               Stream<String> stream = Stream.of("Sony", "Dell", "Mobil", "Subway","Swissair");
               stream.filter(str -> str.startsWith("S")).forEach(System.out::println);
               
     		 }  	    
	}




