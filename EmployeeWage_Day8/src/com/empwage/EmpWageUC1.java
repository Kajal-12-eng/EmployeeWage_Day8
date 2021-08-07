package com.empwage;

public class EmpWageUC1 {
	public void display() {
		System.out.println("Welcome to employee wage program");
	}

	public void empAttendance() {
		int IS_FULL_TIME = 1;
		int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is present");
		else
			System.out.println(" Employee is absent");
	}
}
