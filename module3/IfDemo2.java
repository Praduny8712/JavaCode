package module3;

import java.util.Scanner;

public class IfDemo2 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int num, num2;
		System.out.println("enter num1= ");
		num = Sc.nextInt();
		System.out.println("enter num2= ");
		num2 = Sc.nextInt();

		if (num > num2) {
			System.out.println("num2 is postive = ");
		} else if (num < num2) {
			System.out.println("num2 is neg= ");
		} else {
			System.out.println("num is same");
		}

	}

}
