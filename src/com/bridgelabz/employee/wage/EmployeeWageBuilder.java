package com.bridgelabz.employee.wage;

public class EmployeeWageBuilder {
	public static final int EMP_WAGE_PER_HOUR = 20;
	public static final int FULL_TIME_IS = 1;
	public static final int PART_TIME_IS = 2;

	public static void main(String[] args) {
		System.out.println("Welcome to the employee wage computation program");
		int empHrs = 0;
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		if (empCheck == FULL_TIME_IS) {
			System.out.println("Employee is full time present");
			empHrs = 8;
		} else if(empCheck == PART_TIME_IS) {
			System.out.println("Employee is part time present");
			empHrs = 4;
		}
		else {
			System.out.println("Employee is absent");
		}
		int dailyWage = EMP_WAGE_PER_HOUR * empHrs;
		System.out.println("Employee daily Wage : " + dailyWage);
	}
}