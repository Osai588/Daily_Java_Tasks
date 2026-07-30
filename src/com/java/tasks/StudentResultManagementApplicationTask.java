package com.java.tasks;

import java.util.Scanner;

class Student {
	private String stdName;
	private int stdId;
	private String courseName;
	private double totalMarks;

	public Student(String stdName, int stdId, String courseName, double totalMarks) {
		this.stdName = stdName;
		this.stdId = stdId;
		this.courseName = courseName;
		this.totalMarks = totalMarks;
		System.out.println("Student Record Created Succesfully");
	}

	public double gettotalmarks() {
		return totalMarks;
	}

	private boolean modified = false;

	public void addmarks(double marks) {

		if (marks <= 0) {
			System.out.println("invalid marks entered");
		} else {
			totalMarks = totalMarks + marks;
			modified = true;
			System.out.println("marks updated successfully " + totalMarks);
		}

	}

	public void calculateGrade() {

		if (modified) {
			System.out.println(totalMarks);
			if (totalMarks >= 90) {
				System.out.println("Grade A");
			} else if (totalMarks >= 80) {
				System.out.println("Grade B");

			} else if (totalMarks >= 70) {
				System.out.println("Grade B");

			} else if (totalMarks >= 60) {
				System.out.println("Grade B");
			} else {
				System.out.println("fail");
			}
		} else {
			System.out.println("No marks available to calculate grade");
			System.out.println(totalMarks);
		}
	}

}

public class StudentResultManagementApplicationTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter studentname: ");
		String stdName = sc.nextLine();

		System.out.println("enter studentid: ");
		int stdId = sc.nextInt();

		sc.nextLine();

		System.out.println("enter coursename: ");
		String courseName = sc.nextLine();

		System.out.println("enter totalmarks: ");
		double totalMarks = sc.nextDouble();

		Student std = new Student(stdName, stdId, courseName, totalMarks);
		sc.nextLine();

		boolean exit = true;

		while (exit) {
			System.out.println("1. Add more subject marks\r\n" + "2. Calculate grade\r\n" + "3. View total marks\r\n"
					+ "4. Exit\r\n" + "");
			System.out.println("enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("enter the marks:");
				double marks = sc.nextDouble();
				std.addmarks(marks);
				break;
			}
			case 2: {
				std.calculateGrade();
				break;
			}
			case 3: {
				System.out.println(std.gettotalmarks());
				break;
			}
			case 4: {
				System.out.println("Thank You! Result Processing Completed.");
				exit = false;
				break;
			}
			default: {
				System.out.println("Invalid Option");
			}
			}
		}
		sc.close();
	}

}
