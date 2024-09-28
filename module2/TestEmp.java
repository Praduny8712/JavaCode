package module2;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpClass emp = new EmpClass();
		emp.accept();
		emp.display();
		emp.compleProject();
		emp.checkAttendance();
		emp.applyLoan();

		System.out.println("===============");
		EmpClass emp2 = new EmpClass();
		emp2.accept();
		emp2.display();
		emp2.compleProject();
		emp2.checkAttendance();
		emp2.applyLoan();

	}

}
