package module2;
import java.util.Scanner;
public class Student {
    	//mv
	 private  int roll;
	  private String name;
	   private double score;
	   Scanner Sc=new Scanner(System.in);
	    //mf
    public void accept()
    {
    	System.out.println("Enter a name");
    	name=Sc.next();
    	System.out.println("Enter a Roll");
    	roll=Sc.nextInt();
    	System.out.println("Enter a Score");
    	roll=Sc.nextInt();

    }
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
		   System.out.println("Name= "+name);
		   System.out.println("Roll= "+roll);
		   System.out.println("Score= "+score);
	   }
}
