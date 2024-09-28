package module1;

public class Student {
   private int roll;
   private String name;
   private double score;
   public void attClass()
   {
	   System.out.println("attending the class");
   }
   public void apperExam()
   {
	   System.out.println("appering for exam ");
   }
   public void compAssigment()
   {
	   System.out.println("compting the ass");
   }
   void display()
   {
	   System.out.println("name= "+name);
	   System.out.println("roll= "+roll);
	   System.out.println("score= "+score);
   }
   
   
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.roll=50;
		student.name="Praduny";
		student.score=98.36;
		student.display();
		student.attClass();
		student.apperExam();
		student.compAssigment();
		
		System.out.println("==============");
		Student student2=new Student();
		student2.roll=60;
		student2.name="Psp";
		student2.score=95.36;
		student2.display();
		student2.attClass();
		student2.apperExam();
		student2.compAssigment();
		
		System.out.println("==============");
		Student student3=new Student();
		student3.roll=90;
		student3.name="Patil";
		student3.score=87.36;
		student3.display();
		student3.attClass();
		student3.apperExam();
		student3.compAssigment();


	}

}
