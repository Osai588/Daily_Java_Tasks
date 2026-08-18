package com.java.tasks;

import java.util.Scanner;

class Employee {
	private int employeeId;
	private String employeeName;
	private double basicSalary;

	Employee(double basicSalary, int employeeId, String employeeName) {
		this.basicSalary = basicSalary;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public void setSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getSalary() {
		return basicSalary;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void calculateSalary() {

	}

	public void displayDetails() {

	}

}

class Developer extends Employee {
	Developer(double basicSalary, int employeeId, String employeeName) {
		super(basicSalary, employeeId, employeeName);

	}

	double allowances;

	@Override
	public void calculateSalary() {
		allowances = getSalary() * 0.2;
	}

	@Override
	public void displayDetails() {
		System.out.println("Employee Name : " + getEmployeeName());
		System.out.println("Role : "+ getClass().getSimpleName());
		System.out.println("Basic Salary : " + getSalary());
		System.out.println("Allowances : " + allowances);
		System.out.println("Final Salary : " + (allowances + getSalary()));

	}
}

class Tester extends Employee {

	Tester(double basicSalary, int employeeId, String employeeName) {
		super(basicSalary, employeeId, employeeName);
	}

	double allowances;

	@Override
	public void calculateSalary() {
		allowances = getSalary() * 0.15;
	}

	@Override
	public void displayDetails() {
		System.out.println("Employee Name : " + getEmployeeName());
		System.out.println("Role : "+ getClass().getSimpleName());
		System.out.println("Basic Salary : " + getSalary());
		System.out.println("Allowances : " + allowances);
		System.out.println("Final Salary : " + (allowances + getSalary()));

	}

}

class Manager extends Employee {

	Manager(double basicSalary, int employeeId, String employeeName) {
		super(basicSalary, employeeId, employeeName);
	}

	double allowances;

	@Override
	public void calculateSalary() {
		allowances = getSalary() * 0.3;
	}

	@Override
	public void displayDetails() {
		System.out.println("Employee Name : " + getEmployeeName());
		System.out.println("Role : "+ getClass().getSimpleName());
		System.out.println("Basic Salary : " + getSalary());
		System.out.println("Allowances : " + allowances);
		System.out.println("Final Salary : " + (allowances + getSalary()));

	}

}

public class EmployeeSalaryManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter BasicSalary");
		double basicSalary = sc.nextDouble();

		System.out.println("Enter employeeId");
		int empployeeId = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter employee Name");
		String employeeName = sc.nextLine();

		Employee emp;

		emp = new Developer(basicSalary, empployeeId, employeeName);
		emp.calculateSalary();
		emp.displayDetails();

		System.out.println();

		emp = new Tester(basicSalary, empployeeId, employeeName);
		emp.calculateSalary();
		emp.displayDetails();

		System.out.println();

		emp = new Manager(basicSalary, empployeeId, employeeName);
		emp.calculateSalary();
		emp.displayDetails();

		sc.close();

	}

}
