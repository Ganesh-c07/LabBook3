package com.cg.iter.lab1.b;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring2.xml");
	Employee emp=context.getBean("emp",Employee.class);

	System.out.println("Employee Details");
	System.out.println("-------------------------");
	System.out.println("Employee Id : "+emp.getEmpId());
	System.out.println("Employee Name : "+emp.getEmpName());
	System.out.println("Employee Salary : "+emp.getSalary());
	System.out.println("Employee BU :  "+emp.getBuUnit());
	System.out.println("Age: "+emp.getAge());

	System.out.println("SBU Details");
	System.out.println("sbuCode: "+emp.getBuUnit().getSbuName());
	System.out.println("sbuHead : "+emp.getBuUnit().getSbuHead());
	System.out.println("sbuName : "+emp.getBuUnit().getSbuName());
	System.out.println("Age: "+emp.getAge());
	
}
}
