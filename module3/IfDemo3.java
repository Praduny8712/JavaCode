package module3;

import java.util.Scanner;

public class IfDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Enter a number");
		num1 = sc.nextInt();
		System.out.println("Enter a number");
		num2 = sc.nextInt();
		System.out.println("Enter a number");
		num3 = sc.nextInt();
		if (num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + " =A is greater");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " =B is greater");
		} else {
			System.out.println(num3 + " =C is greater");
		}

	}

}
