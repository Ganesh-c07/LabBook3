package com.cg.iter.lab1.d;

public class EmployeeServiceImpl implements EmployeeService{

	public Employee getDetails(int empId) {
		EmployeeDAO emp=new EmployeeDAO();
		return emp.getDetails(empId);
	}
 
}
