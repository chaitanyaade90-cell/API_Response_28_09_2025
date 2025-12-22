package Static_22_12_2025;

public class Class3 {
	
	static int id;
	static String name;
	static int salary;
	
	static public void Method1() {
		System.out.println("My id is " + id);
	}
	
	static public void Method2() {
		System.out.println("My name is " + name);
	}
	
	static public void Method3() {
		System.out.println("My salary is " + salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class3.id=11;
		Class3.name="AXA";
		Class3.salary=90000;
		
		Class3.Method1();
		Class3.Method2();
		Class3.Method3();

	}

}
