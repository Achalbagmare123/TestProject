package com.starlite.dao;

import com.customer.model.Customer;
import com.rentaldetail.model.RentalDetail;
import com.starlite.model.Book;

public class BookDAO{
	static Book bookArrat[]=new Book[100];
	
	static Book bookArray[]=new Book[100];
	public static boolean addBook(Book book) {
		boolean result=false;
		
		for(int i=0;i<bookArray.length;i++)
		{
			if(bookArray[i]==null) {
				bookArray[i]=book;
				result=true;
				break;
			}
		}
		
		return result;
	}
	public static Book[] displayBooks1() {
		return bookArray;
	}
static Customer customerArrat[]=new Customer[100];
	
	static Customer customerArray[]=new Customer[100];
	public static boolean addCustomer(Customer customer) {
		boolean result=false;
		
		for(int i=0;i<customerArray.length;i++)
		{
			if(customerArray[i]==null) {
				customerArray[i]=customer;
				result=true;
				break;
			}
		}
		
		return result;
	}
	public static Customer[] displayCustomers1() {
		return customerArray;
	}
	public static Book[] displayBooks() {
		// TODO Auto-generated method stub
		return null;
	}
static RentalDetail rentaldetailArrat[]=new RentalDetail[100];
	
	static RentalDetail rentaldetailArray[]=new RentalDetail[100];
	public static boolean addRentalDetail1(RentalDetail rentaldetail) {
		boolean result=false;
		
		for(int i=0;i<rentaldetailArray.length;i++)
		{
			if(rentaldetailArray[i]==null) {
				rentaldetailArray[i]=rentaldetail;
				result=true;
				break;
			}
		}
		
		return result;
	}
	public static RentalDetail[] displayRentalDetails1() {
		return rentaldetailArray;
	}
	
	public static void addRentalDetail(RentalDetail rentaldetail) {
		
	}
	public static RentalDetail[] displayRentalDetails() {
		return null;
	}
	}


