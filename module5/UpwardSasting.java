package module5;

public class UpwardSasting {

	public static void main(String[] args) {
		int a = 100; // upward casting : automatically
		double d = a;
		System.out.println("upward casting= "+d);

		double d1 = 66.65;
		int i = (int) d1; // downward casting : explicit 
		System.out.println("downward casting= "+i);

	}

}
