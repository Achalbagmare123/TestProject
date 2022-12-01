package com.springjdbc.labtest.entity;

public class LoanDetails {
	
	private String custId;
	private String bankId;
	private int loanAmount;
	private String acNumber;
	
	public LoanDetails(String custId, String bankId, int loanAmount, String acNumber) {
		super();
		this.custId = custId;
		this.bankId = bankId;
		this.loanAmount = loanAmount;
		this.acNumber = acNumber;
	}
	
	
	public LoanDetails() {
		super();
	}


	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public int getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getAcNumber() {
		return acNumber;
	}

	public void setAcNumber(String acNumber) {
		this.acNumber = acNumber;
	}

	
	
	
	

}
