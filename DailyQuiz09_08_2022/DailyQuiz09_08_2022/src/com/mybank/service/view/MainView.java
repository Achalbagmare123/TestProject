package com.mybank.service.view;

import com.mybank.service.LoanAccountService;

public class MainView {

	public static void main(String[] args) {
		LoanAccountService Obj = new LoanAccountService();
		int interest = Obj.calculateInterest(4000,690,789,3);
		System.out.println("Interest is ="+interest);
		// TODO Auto-generated method stub

	}

}
