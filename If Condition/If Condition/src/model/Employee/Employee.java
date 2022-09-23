package model.Employee;

public class Employee {
	int employeeId;
    char employeeInitial;
    int employeeSalary;
	int employeeExperience;
	
	public Employee() {
		
	}
	public Employee(int empId,char empInitial,int empSal,int empExp) {
		employeeId=empId;
		employeeInitial=empInitial;
		employeeSalary=empSal;
		employeeExperience=empExp;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public char getEmployeeInitial() {
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
	public int getEmployeeExperience() {
		return employeeExperience;
	}
	public void setEmployeeExperience(int employeeExperience) {
		this.employeeExperience = employeeExperience;
	}




}
