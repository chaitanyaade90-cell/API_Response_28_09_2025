package StaticPackage_13_12_2025;

public class Static2 {
	
	static int id;
	static String name;
	static int salary;
	
	public static void Testing() {
		System.out.println("My id is " + id);
	}
	
	public static void Software() {
		System.out.println("My name is " + name);
	}
	
	public static void BlackBoxTesting() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static2.id=11;
		Static2.name="Ado";
		Static2.salary=10000;
		
		Static2.Testing();
		Static2.Software();
		Static2.BlackBoxTesting();

	}

}
