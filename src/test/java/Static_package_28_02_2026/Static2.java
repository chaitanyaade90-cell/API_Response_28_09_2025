package Static_package_28_02_2026;

public class Static2 {
	
	static int id;
	static String name;
	static int salary;
	
	public static void Priority() {
		
		System.out.println("My id is " + id);
	}
	
	public static void Severity() {
		
		System.out.println("My name is " + name);
	}
	
	public static void L1() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static2.id=22;
		Static2.name="Mumbai";
		Static2.salary=200000;
		
		Static2.Priority();
		Static2.Severity();
		Static2.L1();
		
		

	}

}
