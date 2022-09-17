package org.practicaltest.question1.main;



import org.practicaltest.question1.model.Employee;

public class Main {
	 public static void main(String args[]){
		  
		    Employee[] obj = new Employee[5] ;
		 
		     obj[0] = new Employee("23","AAA","14-02-2022");
		     obj[1] = new Employee("67","BBB","16-05-2022");
		     obj[2] = new Employee("68","CCC","12-03-2022");
		     obj[3] = new Employee("45","DDD","17-08-2022");
		     obj[4] = new Employee("89","EEE","18-02-2022");
		     
		 
		     System.out.println("Employee Object 1:");
		     obj[0].showData();
		     System.out.println("Employee Object 2:");
		     obj[1].showData();
		     System.out.println("Employee Object 3:");
		     obj[2].showData();
		     System.out.println("Employee Object 4:");
		     obj[3].showData();
		     System.out.println("Employee Object 5:");
		     obj[4].showData();
		     
		}
		}



	
