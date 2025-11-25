package Oops_25_11_2025;

public class Oops1 {
	
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
		
		Oops1 op1=new Oops1();
		
		op1.id=33;
		op1.name="Natraj";
		op1.salary=40000;
		
		op1.display();

	}

}
