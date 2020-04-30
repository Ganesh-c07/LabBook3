package com.cg.iter.lab1.d;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring4.xml");
	EmployeeDAO sbu=context.getBean("emp",EmployeeDAO.class);
	System.out.println("Enter Employee Id : ");
	Scanner s=new Scanner(System.in);
	EmployeeService empService=new EmployeeServiceImpl();
	Employee emp=empService.getDetails(s.nextInt());
	if(emp==null){
		System.out.println("No Employee Exist");
	}
	else{
		System.out.println("Employee Id: "+emp.getEmpId());
		System.out.println("Employee Name: "+emp.getEmpName());
		System.out.println("Employee Salary: "+emp.getSalary());
	}
}
}
