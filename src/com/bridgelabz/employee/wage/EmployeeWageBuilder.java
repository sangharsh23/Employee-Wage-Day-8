package com.bridgelabz.employee.wage;

public class EmployeeWageBuilder {
	public static final int FULL_TIME_IS = 1;
	public static final int PART_TIME_IS = 2;
	public static final int EMP_WAGE_PER_HOUR = 20;
	public static final int NO_OF_WORK_DAY = 20;
	public static final int MAX_MONTH_WORK_HRS = 100;

	public static void main(String[] args) {
		System.out.println("Welcome to the employee wage computation program");
		int empHrs = 0;
		int monthWage = 0;
		int monthEmpHrs = 0;
		int totalWorkday = 0;
		while (monthEmpHrs <= MAX_MONTH_WORK_HRS && totalWorkday < NO_OF_WORK_DAY) {
			totalWorkday++;
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

				monthEmpHrs += empHrs;
				int empWage = EMP_WAGE_PER_HOUR * empHrs;
				System.out.println("Day_" + totalWorkday + " Employee Wage : " + empWage);
				System.out.println("Employee hrs : " + empHrs);
				monthWage += empWage;
			}
		System.out.println("Total employee working hrs for 20 day : " + monthEmpHrs);
		System.out.println("Total employee wage for 20 day : " + monthWage);
		}
	}
