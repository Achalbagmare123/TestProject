package com.anudip.labtest;

import com.anudip.labtest.daoimpl.CustomerDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
    	CustomerDaoImpl cdao = new CustomerDaoImpl();
    	cdao.addCustomer();
    	//cdao.fetchCustomer();
    }
}
