package com.bridgelabz.employee.wage;

public class EmployeeWageBuilder {
	public static final int EMP_WAGE_PER_HOUR = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to the employee wage computation program");
		int FULL_TIME_IS = 1;
		int empHrs = 0;
			int empCheck = (int) Math.floor(Math.random() * 10) % 2;
			if (empCheck == FULL_TIME_IS) {
				System.out.println("Employee is present");
			empHrs = 8;
	}
			else {
				System.out.println("Employee is Absent");
		}
			int dailyWage = EMP_WAGE_PER_HOUR * empHrs;
			System.out.println("Employee daily Wage : " + dailyWage);
	}
}