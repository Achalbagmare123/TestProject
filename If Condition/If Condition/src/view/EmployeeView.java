package view;

import model.Employee.Employee;
import service.Employeeservice.EmployeeService;
public class EmployeeView {

	public static void main(String[] args) {
		Employee Obj = new Employee(2,'B',3000,1);
		EmployeeService Obj1 = new EmployeeService();
		boolean value=Obj1.isEligibleForIncrement(Obj);
		System.out.println(value);
		
		

	}

}
