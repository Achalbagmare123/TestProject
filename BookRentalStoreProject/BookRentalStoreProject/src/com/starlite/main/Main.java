package com.starlite.main;
import java.time.LocalDate;


import com.customer.model.Customer;
import com.rentaldetail.model.RentalDetail;
import com.starlite.model.Book;
import java.util.Scanner;

import com.starlite.view.BookView;
	public class Main {
		static Scanner scanner=new Scanner(System.in);
		
		static void displaySubMenu() {
			System.out.println("1. Book Information -");
			System.out.println("2. Customer Information -");
			System.out.println("3. Rental Detail Information -");
			int subMenuChoice=scanner.nextInt();
			scanner.nextLine();
			switch(subMenuChoice) {
			case 1:
				if(BookView.addBook())
					System.out.println("Book information added Sucessfully");
				break;
			case 2:
				if(BookView.addCustomer()) 
					System.out.println("Customer information added Sucessfully");
					break;
			case 3:
					if(BookView.addRentalDetail()) 
						System.out.println("Rental detail information added Sucessfully");
						break;		
				
			case 4:
				Book book[]=BookView.displayBooks();
				for(Book localBook:book) {
					if(localBook!=null)
					System.out.println(localBook);
					else
						break;
				}
				case 5:		
					Customer customer[]=BookView.displayCustomers();
					for(Customer localCustomer:customer) {
						if(localCustomer!=null)
						System.out.println(localCustomer);
						else
							break;
				}
				case 6:
					RentalDetail rentdetail[]=BookView.displayRentalDetails();
				RentalDetail[] rentaldetail = null;
				for(RentalDetail localRentalDetail:rentaldetail) {
						if(localRentalDetail!=null)
						System.out.println(localRentalDetail);
						else
							break;
				}

				break;
				default: 
					System.out.println("Not a valid input");
			}	
		
	}	
		public static void main(String[] args) {
			
			int choice;
			do {
				
				System.out.println("1. Start Application");
				System.out.println("2. Stop Application");
				System.out.println("Enter your choice");
				choice=scanner.nextInt();
				scanner.nextLine();
				switch(choice) {
				case 1:
					displaySubMenu();
				
					break;
				case 2:
					System.exit(0);
					
					break;
					default:
						System.out.println("Not a valid input");
				}
			}while(true);
		}

}
	



