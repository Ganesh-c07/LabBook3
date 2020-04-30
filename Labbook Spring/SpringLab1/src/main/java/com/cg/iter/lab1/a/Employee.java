package com.cg.iter.lab1.a;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	private String buUnit;
	private int age;
	public int getEmpId() {
		return empId;
	}
	public void setEmplId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Employee(int empId, String empName, double salary,
			String buUnit, int age) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.buUnit = buUnit;
		this.age = age;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getBuUnit() {
		return buUnit;
	}
	public void setBuUnit(String buUnit) {
		this.buUnit = buUnit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
