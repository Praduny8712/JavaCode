package module3;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		switch (num) {
		case 5:
			System.out.println("moive time");
			break;
		case 6:
			System.out.println("super sat");
			break;
		case 7:
			System.out.println("sleepy sun");
			break;
		default:
			System.out.println("let us complete the woks");
		}

	}

}
