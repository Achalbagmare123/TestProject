package question1.main;

import java.util.Scanner;

import question1.exception.InvalidException;


public class Main {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  String name;
		  
		  int input;
			do {
				 System.out.print("Enter Full Name :");
				  name = scanner.nextLine();
		 
		   
		  try {
		   if(!name.equals("Achal Bagmare"))
		    throw new InvalidException("Incorrect name\nType correct  name ???");
		  
		   else
		    System.out.println(" Successful !!!");
		  }
		  catch (InvalidException u) {
		   u.printStackTrace();
		  }
		
		  finally {
		   System.out.println("The finally statement is executed");
		  }
		 
			 System.out.println("Enter 1 to add more names");
				input=scanner.nextInt();
				scanner.nextLine();
				}while(input==1);
}
	}


