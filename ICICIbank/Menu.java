package ICICIbank;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		int ch;
		String choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("|========================|");
			System.out.println("|=====PATIL Bank=========|");
			System.out.println("|========================|");
			System.out.println("| 1 . Accpect details    |");
			System.out.println("| 2 . Display details    |");
			System.out.println("| 3 . Withdraw Amount    |");
			System.out.println("| 4 . Depsit Amount      |");
			System.out.println("| 5 . Transfer Amount    |");
			System.out.println("| 6 . Check Balance      |");
			System.out.println("| 7 . Upadate Balance    |");
			System.out.println("| 8 . Exit               |");
			System.out.println("==========================");

			System.out.println("Enter your choice= ");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Accepting th details");
				break;
			case 2:
				System.out.println("Displaying details");
				break;
			case 3:
				System.out.println("Withdraw Amount");
				break;
			case 4:
				System.out.println("Depsit Amount");
				break;
			case 5:
				System.out.println("Transfer Amount");
				break;
			case 6:
				System.out.println("Check Balance");
				break;
			case 7:
				System.out.println("Upadate Balance");
				break;

			case 8:
				System.exit(0);
				System.out.println("Thanku......");
				break;
			}
			System.out.println("do you want continus...?(yes/no)");
			choice = sc.next();

		} while (choice.equalsIgnoreCase("yes"));
		System.out.println("Thanku......");
	}
}