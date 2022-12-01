package com.springjdbc.labtest.dao;

import com.springjdbc.labtest.entity.LoanDetails;

public interface LoanDetailsDao {
	
	public int saveLoanDetails(LoanDetails ld);
	
	public int updateLoanDetails(LoanDetails ld);
	
	public int deleteLoanDetails(LoanDetails ld);


}
