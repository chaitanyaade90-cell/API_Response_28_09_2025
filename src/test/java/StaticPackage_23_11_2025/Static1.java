package StaticPackage_23_11_2025;

public class Static1 {
	
	static int number;
	static String name;
	static int salary;
	
	public static void Sanity() {
		System.out.println("My number is " + number);
	}
	
	public static void Regression() {
		System.out.println("My name is " + name);
	}
	
	public static void BlackBoxTesting() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static1.number=33;
		Static1.name="Chaitanya";
		Static1.salary=50000;
		
		Static1.Sanity();
		Static1.Regression();
		Static1.BlackBoxTesting();

	}

}
