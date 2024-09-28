package module4;

import java.util.Scanner;

public class Emp {
	Scanner sc = new Scanner(System.in);
	private String ename;
	private int empno;
	private double bal;

	public void accept() {
		System.out.println("Enter ename , empno , bal");
		ename = sc.next();
		empno = sc.nextInt();
		bal = sc.nextDouble();
	}

	void display() {
		System.out.println("Name= " + ename);
		System.out.println("Empno= " + empno);
		System.out.println("Balc= " + bal);
	}

	public void checkEmpNo() {
		if (empno > 0) {
			System.out.println("valid no");
		} else {
			System.out.println("invaid no");
		}
	}

	public void checkBal() {
		if (bal >= 0 && bal < 100000) {
			System.out.println("valid bal");
		} else {
			System.out.println("invalid bal");
		}
	}

}
