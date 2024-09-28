package module3;
import java.util.Scanner;
public class IfDemo {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int num;
		System.out.println("enter the number");
		num=Sc.nextInt();
		if (num > 0)
		{
			System.out.println("+ve = ");
		}
		else if (num < 0)
		{
			System.out.println("-ve= ");
		}
		else
		{
			System.out.println("num is zero");
		}

	}

}
