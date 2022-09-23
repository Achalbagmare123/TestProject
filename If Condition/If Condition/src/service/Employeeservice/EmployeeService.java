package service.Employeeservice;

import model.Employee.Employee;

public class EmployeeService {
	Employee emp = new Employee();
	public boolean isEligibleForIncrement(Employee emp) {
		boolean result=false;
		int exp=emp.getEmployeeExperience();
		if(exp<2) {
			result=true;
		}
		return result;
		
	}

}
