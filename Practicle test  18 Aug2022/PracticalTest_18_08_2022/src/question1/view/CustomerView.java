package question1.view;

import question1.model.Customer;
import question1.service.CustomerService;

public class CustomerView {

	public static void main(String[] args) {
		Customer custObj = new Customer(2,"Achal",26);
		CustomerService Obj1 = new CustomerService();
		boolean value=Obj1.checkEligibility(custObj);
		if(value=true) {
			System.out.println("you are eligible for voting");
		}
		else {

			System.out.println("you are not eligible for voting");
		}	
	}
}	

