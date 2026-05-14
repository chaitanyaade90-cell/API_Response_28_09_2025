package Package_14_05_2026;

public class Static2 {
	
	static int id;
	static String name;
	static int salary;
	
	public static void Priority() {
		
		System.out.println("My id is " + id);
	}
	
	public static void Universal() {
		
		System.out.println("My name is " + name);
	}
	
	public static void TestCase() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static2.id=11;
		Static2.name="Aqua";
		Static2.salary=900000;
		
		Static2.Priority();
		Static2.Universal();
		Static2.TestCase();

	}

}
