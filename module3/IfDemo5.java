package module3;
import java.util.Scanner;
public class IfDemo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,a,b;
		System.out.println("Enter a number");
		num = sc.nextInt();
       a=(num/10);
       b=(num%10);
   System.out.println(Math.pow(a, b));
	}

}
