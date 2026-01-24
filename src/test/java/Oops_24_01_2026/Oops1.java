package Oops_24_01_2026;

public class Oops1 {
	
	int id;
	String name;
	int salary;
	
	public void Display() {
		
		System.out.println("id");
		System.out.println(name);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Oops1 o1 = new Oops1();
		
		o1.id=12;
		o1.name="Wipro";
		o1.salary=90000;
		
		o1.Display();

	}

}
