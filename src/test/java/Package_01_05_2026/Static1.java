package Package_01_05_2026;

public class Static1 {
	
	static int id;
	static String name;
	static int salary;
	
	public static void Basic() {
		
		System.out.println("My id is " + id);
	}
	
	public static void Beginner() {
		
		System.out.println("My name is " + name);
	}
	
	public static void Advance() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static1.id=99;
		Static1.name="Magic";
		Static1.salary=100000;
		
		Static1.Basic();
		Static1.Advance();
		Static1.Beginner();

	}

}
