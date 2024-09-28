package module5;

public class OverLoadingDemo {

	static public int add(int a, int b) {
		return (a + b);
	}

	static public int add(int a, int b, int c) {
		return (a + b + c);
	}

	static public double add(double a, double b) {
		return (a + b);
	}

	public static void main(String[] args) {
		int result = add(10, 20);
		System.out.println("result= " + result);

		int result2 = add(10, 20, 30);
		System.out.println("result= " + result2);

		double result3 = add(10, 20.5);
		System.out.println("result= " + result3);
	}

}
