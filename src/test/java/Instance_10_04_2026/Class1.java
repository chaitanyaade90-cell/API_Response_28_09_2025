package Instance_10_04_2026;

public class Class1 {
	
	int id;
	String name;
	int salary;
	
	public void Method1() {
		
		System.out.println("My id is " + id);
	}
	
	public void Method2() {
		
		System.out.println("My name is " + name);
	}
	
	public void Method3() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class1 c1 = new Class1();
		
		c1.id=99;
		c1.name="Wipro";
		c1.salary=99000;
		
		c1.Method1();
		c1.Method2();
		c1.Method3();

	}

}
