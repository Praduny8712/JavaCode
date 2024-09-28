package module2;
import java.util.Scanner;

public class Farm {

		private String fname;
		private int age;
		private String pant;
		  Scanner Sc=new Scanner(System.in);
		
		public void  acc()
		{
			 System.out.println("Enter a Fname");
		    	fname=Sc.next();
		    	System.out.println("Enter a Age");
		    	age=Sc.nextInt();
		    	System.out.println("pant");
		    	pant=Sc.next();
		}
		
		public void tcName()
		{
			System.out.println("kubota");
		}
		public void loc()
		{
			System.out.println("jalgaon");
		}
		public void elec()
		{
			System.out.println("8 am to 8 pm");
		}
		public void show()
		{
			System.out.println("fname= "+fname);
			System.out.println("age= "+age);
			System.out.println("pant name= "+pant);
		}
		
	}

