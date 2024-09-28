package module4;
import java.util.Scanner;

public class User {
	Scanner sc = new Scanner(System.in);
	private String name;
	private int age;
	private double sal;
	public void accept() {
		System.out.println("Enter name , age , salary");
		name=sc.next();
		age=sc.nextInt();
		sal=sc.nextDouble();
	}
	public void checkAge()
	{
		if (age>18)
			System.out.println("you are eligible for vote");
		else if (age>18 && age<100)
		System.out.println("you are valid");
		else 
			System.out.println("not valid");
	}
	public void checkSal() {
		if (sal>0 && sal<100)
			System.out.println("salary is valid");
		else 
			System.out.println("invalid");
	}
	void display() {
		System.out.println("Name= "+name);
		System.out.println("Age= "+age);
		System.out.println("Salary= "+sal);
	}

}
