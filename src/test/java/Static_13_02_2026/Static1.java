package Static_13_02_2026;

public class Static1 {
	
	static int id;
	static String name;
	static int salary;
	
	public static void Method1() {
		
		System.out.println("My id is " + id);
	}
	
	public static void Method2() {
		
		System.out.println("My name is " + name);
	}
	
	public static void Method3() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static1.id=22;
		Static1.name="Winner";
		Static1.salary=99999;
		
		Static1.Method1();
		Static1.Method2();
		Static1.Method3();

	}

}
