package org.model.question1;

import java.util.Objects;

public class Customer {
	private static int accountNumber;
	private static String accountName;
	private static float accountBalance;
	
	public Customer() {
		
	}

	public Customer(int accountNumber, String accountName, float accountBalance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	
	 public static void createAccount(int accountNumber, String accountName, float accountBalance ) {
		System.out.println(accountNumber+" "+"accountName"+" "+accountBalance);
	}
	 public static void setAmount(float a) {
		accountBalance+=a;
		System.out.println("Set amout ="+a);
	}
	 public static void withdrawAmount(float a) {
		if(accountBalance>a) {
			System.out.println("Insufficient Balnace");
		}else {
			accountBalance-=a;
			System.out.println("withdraw amount ="+a);
		}
		
	}
	 public static void getAmount(String accountName, float accountBalance) {
		System.out.println( "Achal your Balnace is "+accountBalance);
	}
	public static void main(String[] args) {
		Customer customerobj=new Customer();
		setAmount(4000);
		createAccount(12345,"Achal",1000);
		withdrawAmount(30000);
		getAmount("Your account balance is", 2000);
		
		
	}

		
	
	
}