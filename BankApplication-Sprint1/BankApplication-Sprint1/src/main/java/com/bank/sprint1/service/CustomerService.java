package com.bank.sprint1.service;

import java.util.List;

import com.bank.sprint1.entity.Customer;

public interface CustomerService {

	// method for saving Customer details
	Customer saveCustomer(Customer customer);

	// method for saving Customer details based on customer Id
	Customer getCustomerById(long customerId);

	// method for fetching all Customer details
	List<Customer> getAllCustomers();

	// method for updating Customer details based on customer Id
	Customer updateCustomerById(Customer customer, long customerId);

	// method for removing Customer detail based on customer Id
	void deleteCustomerById(long customerId);

	// method to fetch customer detail based on customer phone
	Customer getCustomerByPhone(long customerPhone);

}
