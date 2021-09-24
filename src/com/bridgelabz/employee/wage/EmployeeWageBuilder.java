package com.bridgelabz.employee.wage;

public class EmployeeWageBuilder {
	public static final int FULL_TIME_IS = 1;
	public static final int PART_TIME_IS = 2;
	public static final int EMP_WAGE_PER_HOUR = 20;
	public static final int NO_OF_WORK_DAY = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to the employee wage computation program");
		int empHrs = 0;
		int monthWage = 0;
		for (int i = 1; i <= NO_OF_WORK_DAY; i++) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case FULL_TIME_IS:
				System.out.println("Employee is Full Time present");
				empHrs = 8;
				break;
			case PART_TIME_IS:
				System.out.println("Employee is Part Time Present");
				empHrs = 4;
				break;
			default:
				System.out.println("Employee is Absent");
				empHrs = 0;
			}

			int empWage = EMP_WAGE_PER_HOUR * empHrs;
			System.out.println("Day-"+ i + " Employee Wage : " + empWage);
			monthWage += empWage;
		}

		System.out.println("Employee month Wage : " + monthWage);
	}
}