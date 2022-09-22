package com.mybank.service;

public class LoanAccountService {
	int loanId;
	int loanAmount;
	int rateOfInterest;
	int timePeriod;
	
	public int calculateInterest(int id,int amount,int rai,int tp){
	int interest =(amount*tp*rai)/100;
		return interest;
		
	}

}
