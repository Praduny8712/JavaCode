package module5;

public class OverLoadMain {
	public void main() {
		System.out.println("main method without parameters");
	}

	public void main(int a, int b) {
		System.out.println("main method 2 parameters");
	}

	public void main(int a) {
		System.out.println("main method 1 parameters");
	}

	public static void main(String[] args) {
		OverLoadMain obj = new OverLoadMain();
		obj.main();
		obj.main(10);
		obj.main(10, 20);
	}

}
