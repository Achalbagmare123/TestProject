package com.springjdbc.labtest.daoImpl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.labtest.dao.LoanDetailsDao;
import com.springjdbc.labtest.entity.LoanDetails;

public class LoanDetailsDaoImpl implements LoanDetailsDao{

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int saveLoanDetails(LoanDetails ld) {
		String query = "insert into LoanDetails values('"+ ld.getCustId() +"','"+ ld.getBankId()+"','"+ ld.getLoanAmount()+"','"+ ld.getAcNumber()+"')";
		return jdbcTemplate.update(query);
	}
	public int updateLoanDetails(LoanDetails ld) {
		String query = "update LoanDetails set custid = '"+ld.getLoanAmount()+"' , bankId = '"+ld.getBankId()+"' , acNumber = '"+ld.getAcNumber()+"' where custid = '"+ld.getCustId() +"'";
		return jdbcTemplate.update(query);
	}
	public int deleteLoanDetails(LoanDetails ld) {
		String query = "delete from LoanDetails  where custid='"+ld.getCustId()+"'";
		return jdbcTemplate.update(query);
	}
	
}
