package module5;

public class TestCircle {

	public static void main(String[] args) {
		Circle circle = new Circle();
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		circle.accept();
		circle.calArea();
		circle.calPeri();
		circle.display();

		System.out.println(circle1.hashCode());
		System.out.println(circle.hashCode());
		System.out.println(circle2.hashCode());
	
		boolean result=circle.equals(circle2);
		System.out.println(result);
		
	}

}
