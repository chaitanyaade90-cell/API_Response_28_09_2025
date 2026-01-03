package Ovveride_package_03_01_2026;

class Student
{
	
	public void college() {
		System.out.println("All students are applicable for Scholarship");
	}

	public void Liabrary() {
		// TODO Auto-generated method stub
		
	}
}

class Fees extends Student
{
	@Override
	public void Liabrary() {
		
		System.out.println("All students are applicable for liabrary fees");
	}
}

public class Ovveride1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fees f1 = new Fees();
		f1.college();
		f1.Liabrary();
		
		
		

	}

}
