package com.starlite.view;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import com.customer.model.Customer;
import com.rentaldetail.model.RentalDetail;
import com.starlite.model.Book;
import com.starlite.service.BookService;
	public class BookView {
	static Scanner scanner=new Scanner(System.in);
	public static boolean addBook() {
		System.out.println("Book Information -");
		System.out.println("Enter a Book Id :");
		int bookId=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter a Book Name :");
		String bookName=scanner.nextLine();
		System.out.println("Enter a Author Name :");
		String authorName=scanner.nextLine();
		System.out.println("Enter a Publisher Name :");
		String publisher=scanner.nextLine();
		scanner.nextLine();
		
		Book book=new Book(bookId,"bookName","authorName","publisher");
		BookService.addBook(book);
		return true;
	}

		public static Book[] displayBooks() {
			return BookService.displayBooks();
		}
		public static boolean addCustomer() {
			System.out.println("Customer Information -");
			System.out.println("Enter a Customer Id :");
			int customerId=scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter a Customer Name :");
			String customerName=scanner.nextLine();
			System.out.println("Enter Customer Phone Number :");
			String customerPhoneNumber=scanner.nextLine();	 		
			System.out.println("Enter a Customer Address :");			
			scanner.nextLine();
			
		
			String customerAddress = null;
			Customer customer=new Customer( customerId,customerName,customerPhoneNumber,customerAddress );
			BookService.addCustomer(customer);
			return true;
		}
		public static Customer[] displayCustomers() {
			return BookService.displayCustomers1();
		}
			public static boolean addRentalDetail() {
				System.out.println("Rental detail Information -");
				System.out.println("Enter a Issue Date : ");
				String issueDate=scanner.nextLine();
				LocalDate localdate=LocalDate.now();
				System.out.println(localdate);
				scanner.nextLine();
				System.out.println("Enter a Return Date :");		
		        String returnDateString=scanner.nextLine();
		        LocalDate localdate1=LocalDate.parse(returnDateString);//YYYY-MM-DD       
				System.out.println(localdate1);
				scanner.nextLine();
				System.out.println("Calculate the days between the Issue and Return Date :");
		        LocalDate localdate3=LocalDate.parse(returnDateString);//YYYY-MM-DD  
				long noOfDays=ChronoUnit.DAYS.between(LocalDate.now(), localdate3);
				System.out.println(noOfDays);
				scanner.nextLine();
				System.out.println("Enter a Rental Price :");	
				String rentalPrice=scanner.nextLine();	 	
				scanner.nextLine();
				System.out.println("Enter a Number of Copies :");	
				String copies=scanner.nextLine();	 	
				scanner.nextLine();
				RentalDetail rentaldetail=new RentalDetail("issueDate","returnDate","calculateDays","copies","rentalPrice");
				BookService.addRentalDetail(rentaldetail);
				return true;
			}
			public static RentalDetail[] displayRentalDetails() {
				return BookService.displayRentalDetails();
			
	}	
	}

	


	

