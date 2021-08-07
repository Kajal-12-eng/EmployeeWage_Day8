package com.empwage;

public class EmpWageUC2 {
	public static final int IS_FULL_TIME = 1;

	public static int computeEmpWage() {
		int empWorkingHours = 0, wagePerHours = 20, salary = 0;
		int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is full time  present");
			empWorkingHours = 8;
		} else {
			System.out.println("Employee is absent");
			empWorkingHours = 0;
		}
		salary = empWorkingHours * wagePerHours;
		System.out.println("salary:: " + salary);
		return salary;
	}
}