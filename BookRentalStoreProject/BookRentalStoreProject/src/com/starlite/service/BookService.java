
	package com.starlite.service;

	import com.customer.model.Customer;
import com.rentaldetail.model.RentalDetail;
import com.starlite.dao.BookDAO;
	
	import com.starlite.model.Book;

	public class BookService {
		public static boolean addBook(Book book) {
			boolean result=false;
			BookDAO.addBook(book);
			return result;
		}
		public static Book[] displayBooks() {
			return BookDAO.displayBooks();
		}
		 public static boolean addCustomer(Customer customer) {
		    	boolean result=false;
		    	BookDAO.addCustomer(customer);
		    	return result;
		    }
		    public static Customer[] displayCustomers1() {
		    	return BookDAO.displayCustomers1();
		    }
		    public static boolean addRentalDetail(RentalDetail rentaldetail) {
		    	boolean result=false;
		    	BookDAO.addRentalDetail(rentaldetail);
		    	return result;
		    }
		    public static RentalDetail[] displayRentalDetails() {
		    	return BookDAO.displayRentalDetails();
		    }

		    
		 
	}



