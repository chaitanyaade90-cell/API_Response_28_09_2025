package Oops_07_02_2026;

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
		
		Oops1 o1 = new Oops1();
		
		o1.id=11;
		o1.name="XYZ";
		o1.salary=90000;
		
		o1.display();
		

	}

}
