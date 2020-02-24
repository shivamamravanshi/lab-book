package com.cg.eis.entity;

import com.cg.eis.exception.EmployeeException;

public class Employee {
	String employeeId;
	String employeeName;
	double employeeSalary;

	public Employee(String employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		if (validateSalary(employeeSalary)) {
			this.employeeSalary = employeeSalary;
		}
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public boolean validateSalary(double salary) {
		if (this.employeeSalary < 3000) {
			throw new EmployeeException("Salary cannot be less than 3000");
		}
		return true;
	}

	@Override
	public boolean equals(Object employee) {
		if (employee == this)
			return true;
		if (employee == null || !(employee instanceof Employee))
			return false;
		Employee emp = (Employee) employee;
		String employeeId1 = this.employeeId;
		String employeeId2 = emp.getEmployeeId();
		return employeeId1.equals(employeeId2);
	}

	@Override
	public int hashCode() {
		return employeeId.hashCode();
	}

	@Override
	public String toString() {
		return "Employee[Id: " + employeeId + " Name: " + employeeName + " Salary: " + employeeSalary + "]";
	}

}
