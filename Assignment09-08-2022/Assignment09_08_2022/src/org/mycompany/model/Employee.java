package org.mycompany.model;

public class Employee {
	int employeeId=2;
	char employeeInitial='S';
	int employeeSalary=20000;
	
	public Employee(){
		
	}
    public Employee(int id,char initial,int salary) {
    	
    }
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getEmployeeInitial() {
		return employeeInitial;
	}
	public void setEmployeeInitial(char employeeInitial) {
		this.employeeInitial = employeeInitial;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
    
}
