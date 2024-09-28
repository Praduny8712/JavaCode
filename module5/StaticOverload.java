package module5;

public class StaticOverload {

	static public void main() {
		System.out.println("main method without parameters");
	}

	static public void main(int a, int b) {
		System.out.println("main method 2 parameters");
	}

	static public void main(int a) {
		System.out.println("main method 1 parameters");
	}

	public static void main(String[] args) {
		main();
		main(20, 30);
		main(20);

	}
}
