package org.mycompany.model.service.view;

import org.mycompany.model.Employee;
import org.mycompany.model.service.EmployeeService;

public class EmployeeView {

	public static void main(String[] args) {
		Employee Employee1 = new Employee();
		EmployeeService Employeeser1 = new EmployeeService();
		System.out.println("Employee Old Salary =" + Employee1.getEmployeeSalary());
		Employee updatedSalary = Employeeser1.calculateSalaryIncrement(Employee1);
		System.out.println("Employee Id =" + updatedSalary.getEmployeeId());
		System.out.println("Employee Initial =" + updatedSalary.getEmployeeInitial());
		System.out.println("Employee new Salary =" + updatedSalary.getEmployeeSalary());



		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
