package com.empwage;

public class EmpWageCheck {
	public static void main(String[] args) {
		EmpWageUC1 emp1 = new EmpWageUC1();
		emp1.display();
		emp1.empAttendance();
		EmpWageUC2 emp2 = new EmpWageUC2();
		emp2.computeEmpWage();
		EmpWageUC3 emp3 = new EmpWageUC3();
		emp3.computeEmpWage();
		EmpWageUC4 emp4 = new EmpWageUC4();
		emp4.computeEmpWage();
		EmpWageUC5 emp5 = new EmpWageUC5();
		emp5.computeEmpWage();
		EmpWageUC6 emp6 = new EmpWageUC6();
		emp6.computeEmpWage();
		EmpWageUC7 emp7 = new EmpWageUC7();
		emp7.computeEmpWage();
		EmpWage dMart = new EmpWage("dMart", 28, 2, 10);
		EmpWage reliance = new EmpWage("reliance", 10, 4, 20);
		dMart.computeEmployeeWage();
		System.out.println(dMart);
		reliance.computeEmployeeWage();
		System.out.println(reliance);
	}
}
