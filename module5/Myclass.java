package module5;

class Myclass1 {
	public void fun() {
		System.out.println("this is a fun1");
	}
}

class Myclass2 {
	public void fun2() {
		System.out.println("this is a fun2");
	}
}

public class Myclass {

	public static void main(String[] args) {

		Myclass2 myclass2 = new Myclass2();
		myclass2.fun2();

		Myclass1 myclass1 = new Myclass1();
		myclass1.fun();

	}

}
