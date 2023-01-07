package com.bank.sprint1.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bank.sprint1.entity.Customer;
import com.bank.sprint1.exception.CustomerNotFoundException;
import com.bank.sprint1.repository.CustomerRepository;
import com.bank.sprint1.service.CustomerService;

@Service
//implement all my CRUD method, all business logic
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository crepo;

	// saving customer details using save() of JpaRepository
	public Customer saveCustomer(Customer customer) {
		return crepo.save(customer);
	}

	// fetching all customer details from table based on id,if not found then throw
	// exception
	public Customer getCustomerById(long customerId) {
		return crepo.findById(customerId)
				.orElseThrow(() -> new CustomerNotFoundException("Entered Customer id does not exist in the system"));
	}

	// fetching all customer details from table using findAll() of JpaRepository
	public List<Customer> getAllCustomers() {
		return crepo.findAll();
	}

	// updating customer details based on id from table using Save()
	public Customer updateCustomerById(Customer customer, long customerId) {
		Customer customer1 = crepo.findById(customerId)
				.orElseThrow(() -> new CustomerNotFoundException("Entered Customer id does not exist in the system"));

		// set new values
		customer1.setCustomerPhone(customer.getCustomerPhone());
		crepo.save(customer1);
		return customer1;

	}

	// remove customer details based on id from table using deleteById()
	public void deleteCustomerById(long customerId) {
		crepo.findById(customerId)
				.orElseThrow(() -> new CustomerNotFoundException("Entered Customer id does not exist in the system"));
		crepo.deleteById(customerId);
	}

	// fetching customer details based on getCustomerByPhone()
	public Customer getCustomerByPhone(long customerPhone) {
		return crepo.getCustomerByPhone(customerPhone);
	}

}
