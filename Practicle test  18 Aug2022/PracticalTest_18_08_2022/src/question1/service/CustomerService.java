package question1.service;

import question1.model.Customer;

public class CustomerService {
	
	public boolean checkEligibility(Customer custObj1) {
		boolean result=false;
		if(custObj1.getCustAge()>=18) {
			result=true;
		}
		return result;
	}

}
