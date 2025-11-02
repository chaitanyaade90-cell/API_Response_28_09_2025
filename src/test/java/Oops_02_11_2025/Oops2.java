package Oops_02_11_2025;

public class Oops2 {
	
	int id;
	String name;
	int salary;
	
	public void display() {
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Oops2 op=new Oops2();
		op.id=89;
		op.name="Akshay";
		op.salary=20000;
		op.display();

	}

}
