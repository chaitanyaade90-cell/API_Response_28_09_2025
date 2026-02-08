package Static_08_02_2026;

public class Static1 {
	
	static int id;
	static String name;
	static int salary;
	
	public static void Onboarding() {
		
		System.out.println("My id is " + id);
	}
	
	public static  void RecordTest() {
		
		System.out.println("My name is " + name);
	}
	
	public static void RunTest() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static1.id=99;
		Static1.name="Wipro";
		Static1.salary=90000;
		
		Static1.Onboarding();
		Static1.RecordTest();
		Static1.RunTest();

	}

}
