package module1;

public class Fram {
	private String fname;
	private int age;
	private String pant;
	
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fram Fram1=new Fram ();
		Fram1.fname="praduny";
		Fram1.age=24;
		Fram1.pant="banana";
		Fram1.tcName();
		Fram1.loc();
		Fram1.elec();
		Fram1.show();
		
		System.out.println("===================");
		
		Fram Fram2=new Fram ();
		Fram2.fname="Sanjay";
		Fram2.age=28;
		Fram2.pant="banana";
		Fram2.tcName();
		Fram2.loc();
		Fram2.elec();
		Fram2.show();
		
		System.out.println("===================");
		Fram Fram3=new Fram ();
		Fram3.fname="Patil";
		Fram3.age=44;
		Fram3.pant="banana";
		Fram3.tcName();
		Fram3.loc();
		Fram3.elec();
		Fram3.show();
	}

}
