package module3;

import java.util.Scanner;

public class IfDemo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter a number");
		num = sc.nextInt();
		if (num >= 10 && num < 100) {
			System.out.println("2 digit");
		} else if (num >= 100 && num < 1000) {
			System.out.println("3 digit");
		} else if (num >= 1000 && num < 10000) {
			System.out.println("4 digit");
		} else {
			System.out.println("1 digit");
		}
	}

}
