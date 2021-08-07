package com.empwage;

public class EmpWageUC3 {
	public int computeEmpWage() {
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int empWorkingHours = 0, wagePerHours = 20, salary = 0;
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is full time  present");
			empWorkingHours = 8;
		} else if (empCheck == IS_PART_TIME) {
			System.out.println("Employee is part time Present");
			empWorkingHours = 4;
		} else {
			System.out.println("Employee is absent");
			empWorkingHours = 0;
		}
		salary = empWorkingHours * wagePerHours;
		System.out.println("salary:: " + salary);
		return salary;
	}
}
