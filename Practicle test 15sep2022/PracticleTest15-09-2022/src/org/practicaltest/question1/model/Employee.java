package org.practicaltest.question1.model;

import java.util.Objects;

public class Employee {
	 String empid;
	  String name;
	  String joiningDate;
	  public Employee(String empid, String name, String joiningDate){
		    this.empid = empid;
		     this.name = name;
		     this.joiningDate=joiningDate;		 ;
		  }
	public void showData(){
		   System.out.print("EmpId = "+empid + "  " + " Employee Name = "+name + " "+"Joining date = "+joiningDate);
		   System.out.println();
		 }
		}


