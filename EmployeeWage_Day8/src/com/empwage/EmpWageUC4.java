package com.empwage;

public class EmpWageUC4 {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int IS_ABSENT = 0;

	public  int computeEmpWage() {
		int empWorkingHours = 0, wagePerHours = 20, salary = 0;
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		switch (empCheck) {
		case IS_FULL_TIME:
			System.out.println("Employee is full time  present");
			empWorkingHours = 8;
			break;
		case IS_PART_TIME:
			System.out.println("Employee is part time Present");
			empWorkingHours = 4;
			break;
		case IS_ABSENT:
			System.out.println("Employee is absent");
			empWorkingHours = 0;
			break;
		}
		salary = empWorkingHours * wagePerHours;
		System.out.println("salary:: " + salary);
		return salary;
	}
}
