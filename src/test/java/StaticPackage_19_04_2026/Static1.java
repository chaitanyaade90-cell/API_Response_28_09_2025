package StaticPackage_19_04_2026;

public class Static1 {
	
	static int id;
	static String name;
	static int salary;
	
	public static void Smoke() {
		
		System.out.println("My id is " + id);
	}
	
	public static void Software() {
		
		System.out.println("My name is " + name);
	}
	
	public static void runtest() {
		
		System.out.println("My salary is " + salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static1.id=11;
		Static1.name="SBIL";
		Static1.salary=90000;
		
		Static1.Smoke();
		Static1.Software();
		Static1.Smoke();

	}

}
