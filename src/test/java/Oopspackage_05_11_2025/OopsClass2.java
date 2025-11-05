package Oopspackage_05_11_2025;

public class OopsClass2 {
	
	int id;
	String name;
	int salary;
	
	public void Display() {
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OopsClass2 op=new OopsClass2();
		op.id=11;
		op.name="Insta";
		op.salary=20000;
		op.Display();

	}

}
