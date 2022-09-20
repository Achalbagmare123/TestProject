package org.mycompany.model.service;

import org.mycompany.model.Employee;

public class EmployeeService {
	Employee Obj = new Employee();
 	public Employee calculateSalaryIncrement(Employee Obj) {
	int incrementedSalary = Obj.getEmployeeSalary()+(Obj.getEmployeeSalary()*25)/100;
	Obj.setEmployeeSalary(incrementedSalary);
    return Obj;
	}
	
}
