package module5;

import java.util.Scanner;

public class Circle {
	Scanner sc = new Scanner(System.in);
	private int r;
	private double area1;
	private double peri;
	final double PI = 3.14;

	public void accept() {
		System.out.println("enter redius");
		r = sc.nextInt();
	}

	public void calArea() {
		area1 = PI * r * r;
	}

	public void calPeri() {
		peri = 2 * PI * r;
	}

	public void display() {
		System.out.println("Redius= " + r);
		System.out.println("Area= " + area1);
		System.out.println("Perimetr= " + peri);
	}

}
