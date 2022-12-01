package com.springjdbc.labtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.labtest.daoImpl.LoanDetailsDaoImpl;
import com.springjdbc.labtest.entity.LoanDetails;



public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ct = new ClassPathXmlApplicationContext("applicationContext.xml");
    	LoanDetailsDaoImpl lddaoi = (LoanDetailsDaoImpl) ct.getBean("loan"); 
    	 //int status = lddaoi.saveLoanDetails(new LoanDetails("568HJ","987YJ",56787,"345OHJ"));
        //System.out.println(status);
        
        //int status = lddaoi.updateLoanDetails(new LoanDetails("568HJ","987YJ",65738,"345OHJ"));
        //System.out.println(status);
    	
    	LoanDetails ld1 = new LoanDetails();
        ld1.setCustId("56787");
       int status = lddaoi.deleteLoanDetails(ld1);
        System.out.println(status);
        
        
         
    }
}
