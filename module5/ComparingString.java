package module5;

public class ComparingString {

	public static void main(String[] args) {
		int a = 100;
		int b = 100;
		if (a == b)
			System.out.println("Same");
		else
			System.out.println("not same");

		String str1 = "praduny";
		String str2 = "praduny";
		if (str1 == str2)
			System.out.println("Same");
		else
			System.out.println("not same");
		System.out.println("====================");
		String str3 = new String("Praduny");
		String str4 = new String("Praduny");
		if (str3.equals(str4))
			System.out.println("Same");
		else
			System.out.println("not same");
		if(str3.equals("PSP"))
			System.out.println("Same");
		else
			System.out.println("not same");
		System.out.println("==================");
		if (str3.equalsIgnoreCase(str4))
			System.out.println("Same........");
		else
			System.out.println("not same");
		
		
		
		

	}

}
