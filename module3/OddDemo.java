package module3;

import java.util.Scanner;

public class OddDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = 1;
		System.out.println("Enter the number");

		num1 = sc.nextInt();
		while (num1 <= 20) {
			if (num1 % 2 == 0)
				System.out.println("Odd numbe" + num1);
			num1++;
		}

	}

}
