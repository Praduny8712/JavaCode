package module2;

import java.util.Scanner;

public class EmpClass {

	private int empNo;
	private String ename;
	private double empSal;
	Scanner Sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter a name");
		ename = Sc.next();
		System.out.println("Enter a EmpNo");
		empNo = Sc.nextInt();
		System.out.println("Enter a salary");
		empSal = Sc.nextDouble();
	}

	public void compleProject() {
		System.out.println("completing Project");
	}

	public void checkAttendance() {
		System.out.println("Attendance is done ");
	}

	public void applyLoan() {
		System.out.println("Appling for loan");
	}

	public void display() {
		System.out.println("Name= " + ename);
		System.out.println("empNo= " + empNo);
		System.out.println("Salary= " + empSal);
	}

}
