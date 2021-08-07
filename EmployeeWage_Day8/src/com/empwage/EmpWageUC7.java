package com.empwage;

public class EmpWageUC7 {
	public static final int IS_FULL_TIME = 1;	
	public static final int IS_PART_TIME = 2;
	public static final int IS_ABSENT = 0;
	public static final int MAX_WORKING_DAYS = 20;
	public static final int MAX_WORKING_HOURS = 100;

	public static int computeEmpWage() {
		int empWorkingHours = 0, wagePerHours = 20, salary = 0, workingDays = 0, workinghours = 0;
		while (workingDays <= MAX_WORKING_DAYS && workinghours <= MAX_WORKING_HOURS) {
			workingDays++;
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

			salary += empWorkingHours * wagePerHours;
			workinghours += empWorkingHours;
		}
		System.out.println("salary:: " + salary);
		return salary;
	}
}
